package Tests;

import org.junit.jupiter.api.Test;
import utility.StringUtil;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
class StringUtilAnagramCheckTest {
    @Test
    public void testisAnagram_WithCyanString() {
        // Test Cyan strings

        assertFalse(StringUtil.isAnagram("continuous integration", "i am not even trying"), "JAVA SAYS ITS SAME");
        assertFalse(StringUtil.isAnagram("design patterns","trending passions"), "JAVA SAYS ITS SAME");
        assertFalse(StringUtil.isAnagram("software architecture","wise tracer of hi tech war"), "JAVA DOESNT SAY ITS SAME");
        assertTrue(StringUtil.isAnagram("software","waresoft"), "JAVA DOESNT SAY ITS SAME");

    }

    @Test
    public void testisAnagram_WithAllSameChars() {
        // Test where all similar characters
        String data1 = "999999999";
        String data2 = "999999999";
        boolean result = StringUtil.isAnagram(data1, data2);
        assertTrue(result, "JAVA SAYS ITS SAME");
    }

    @Test
    public void testisAnagram_WithEmptyString() {
        // Test an empty string
        String data1 = "";
        String data2 = "";
        boolean result = StringUtil.isAnagram(data1, data2);
        assertTrue(result, "JAVA SAYS ITS SAME");
    }

    @Test
    public void testisAnagram_WithComplexString() {
        // Test an empty string
        String data1 = "oh! my  eyes, ... ";
        String data2 = "hoy, see  my ...!";
        boolean result = StringUtil.isAnagram(data1, data2);
        assertTrue(result, "JAVA SAYS ITS SAME");
    }
}