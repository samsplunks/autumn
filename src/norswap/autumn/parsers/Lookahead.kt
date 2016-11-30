package norswap.autumn.parsers
import norswap.autumn.Grammar
import norswap.autumn.Parser
import norswap.autumn.BadMatch

// -------------------------------------------------------------------------------------------------

inline fun Grammar.ahead (crossinline p: Parser): Boolean
{
    val pos0 = pos
    val result = ignore_errors_if_successful(p)
    pos = pos0
    return result
}

// -------------------------------------------------------------------------------------------------

inline fun Grammar.not (crossinline p: Parser): Boolean
{
    val pos0 = pos
    val ptr0 = log.size
    val result = ignore_errors(p)
    if (result) {
        undo(pos0, ptr0)
        fail(pos0, BadMatch)
    }
    return !result
}

// -------------------------------------------------------------------------------------------------
