package WarmUp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSubstringTest {

    private final StringSubstring stringSubstring = new StringSubstring();
    @Test
    void testDiff21() {
        assertEquals(2, stringSubstring.diff21(19));
        assertEquals(11, stringSubstring.diff21(10));
        assertEquals(0, stringSubstring.diff21(21));
        assertEquals(8, stringSubstring.diff21(25));
    }
}