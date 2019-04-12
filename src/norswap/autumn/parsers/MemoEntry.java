package norswap.autumn.parsers;

import norswap.autumn.LineMap;
import norswap.autumn.Parser;
import norswap.autumn.SideEffect;
import java.util.List;

/**
 * A {@link Memoizer} entry, indicating a match over a range of the input, or a failure to match a
 * token at a given position.
 *
 * <p>Such entries are generated by a {@link Memo} parser or by a user-defined custom parser, which
 * must assign them a hash based on the starting position, and potentially the parser and the
 * context. This hash may not be 0.
 *
 * <p>A failure to match is a valid entry, characterized by a -1 {@link #end_position} and a null
 * {@link #delta}. You can use {@link #no_match} to construct these entries.
 */
public final class MemoEntry
{
    // ---------------------------------------------------------------------------------------------

    /**
     * The hash generated for this entry from the start position and potentially the parser and the
     * context. May not be 0.
     */
    public final int hash;

    /** The parser that generated this result. */
    public final Parser parser;

    /** The start position of the match. */
    public final int start_position;

    /** The end position of the match. */
    public final int end_position;

    /** List of side-effects generated by the match. */
    public final List<SideEffect> delta;

    // ---------------------------------------------------------------------------------------------

    public MemoEntry (int hash, Parser parser, int start_position, int end_position, List<SideEffect> delta)
    {
        if (hash == 0)
            throw new IllegalArgumentException("Memo entry hashes may not be 0");

        this.hash = hash;
        this.parser = parser;
        this.start_position = start_position;
        this.end_position = end_position;
        this.delta = delta;
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a result that indicates that the parser didn't match at the given position.
     */
    public static MemoEntry no_match (int hash, Parser parser, int start_position)
    {
        return new MemoEntry(hash, parser, start_position, -1, null);
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns true iff the result indicates a match.
     */
    public boolean matched()
    {
        return end_position > 0;
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a textual representation of the entry, converting the position using {@code map} (can
     * be null, in which case plain offsets will be used).
     *
     * <p>Compared to {@link #toString(LineMap)}, this generates entries that look good in a dump of
     * a memoization table. This omits the class name, the hash, and the parser names if {@code
     * parser_name} is false.
     */
    public String listing_string (LineMap map, boolean parser_name)
    {
        String start = LineMap.string(map, start_position);

        if (!matched())
            return "at " + start + ": no match";

        StringBuilder b = new StringBuilder(128);

        b   .append("from ")    .append(start)
            .append(" to ")     .append(LineMap.string(map, end_position));

        if (parser_name)
            b.append(": ").append(parser);

        return b.toString();
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Returns a textual representation of the entry, converting the position using {@code map} (can
     * be null, in which case plain offsets will be used).
     */
    public String toString (LineMap map)
    {
        StringBuilder b = new StringBuilder(128);

        b   .append("MemoEntry {")
            .append("{ hash = ")   .append(hash)
            .append(", parser = ") .append(parser)
            .append(", ");

        if (matched())
            b   .append("range = [")
                .append(LineMap.string(map, start_position))
                .append(" - ")
                .append(LineMap.string(map, end_position))
                .append("]");
        else
            b   .append("no match");

        b.append(" }");
        return b.toString();
    }

    // ---------------------------------------------------------------------------------------------

    @Override public String toString () {
        return toString(null);
    }

    // ---------------------------------------------------------------------------------------------
}