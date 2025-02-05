package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utility.StringUtil;

class StringUtilMarkerTest {

    @Test
    public void testFindMarker_WithCyanString() {
        // Test Cyan strings

        Assertions.assertEquals(5, StringUtil.indexOfMarker("bvwbjplbgvbhsrlpgdmjqwftvncz"), "should return 5");
        Assertions.assertEquals(6, StringUtil.indexOfMarker("nppdvjthqldpwncqszvftbrmjlhg"), "should return 6");
        Assertions.assertEquals(10, StringUtil.indexOfMarker("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"), "Should return 10");
        Assertions.assertEquals(11, StringUtil.indexOfMarker("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"), "should return 11");
    }

    @Test
    public void testFindMarker_WithUniqueChars() {
        // Test with unique
        String sequence = "plmnt";
        int result = StringUtil.indexOfMarker(sequence);
        assertEquals(4, result, "unique set should be at 4");
    }

    @Test
    public void testFindMarker_WithDuplicateChars() {
        // Test with duplicates
        String sequence = "zzxc";
        int result = StringUtil.indexOfMarker(sequence);
        assertEquals(-1, result, "Should return -1");
    }

    @Test
    public void testFindMarker_WithMinimumLength() {
        // Test string smaller than 4 chars
        String sequence = "qaz";
        int result = StringUtil.indexOfMarker(sequence);
        assertEquals(-1, result, "marker rule is for 4 unique chars");
    }

    @Test
    public void testFindMarker_WithAllSameChars() {
        // Test where all similar characters
        String sequence = "11111";
        int result = StringUtil.indexOfMarker(sequence);
        assertEquals(-1, result, "Should return -1 all are similar");
    }

    @Test
    public void testFindMarker_WithEmptyString() {
        // Test an empty string
        String sequence = "";
        int result = StringUtil.indexOfMarker(sequence);
        assertEquals(-1, result, "Empty string should return -1");
    }

}