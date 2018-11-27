package norswap.autumn.parsers;

import norswap.autumn.Parse;
import norswap.autumn.Parser;
import norswap.autumn.ParserVisitor;
import java.util.Collections;

/**
 * A parser that always succeeds.
 */
public final class Empty extends Parser
{
    @Override protected boolean doparse (Parse parse) {
        return true;
    }

    @Override public void accept (ParserVisitor visitor) {
        visitor.visit(this);
    }

    @Override public Iterable<Parser> children () {
        return Collections.emptyList();
    }

    @Override public String toStringFull () {
        return "empty";
    }
}
