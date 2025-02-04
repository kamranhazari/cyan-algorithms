package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utility.StringUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilPalindromeCheckTest {
    @Test
    public void testisPalindrome_WithCyanString() {
        // Test Cyan strings

        assertTrue(StringUtil.isPalindrome("rAcecaR"), "JAVA READS IT SAME");
        assertTrue(StringUtil.isPalindrome("radar"), "JAVA READS IT SAME");
        Assertions.assertFalse(StringUtil.isPalindrome("fail"), "JAVA DOESNT READ IT AS SAME");
    }

    @Test
    public void testisPalindrome_WithAllSameChars() {
        // Test where all similar characters
        String data = "11111";
        boolean result = StringUtil.isPalindrome(data);
        assertTrue(result, "JAVA READS IT SAME");
    }

    @Test
    public void testisPalindrome_WithEmptyString() {
        // Test an empty string
        String data = "";
        boolean result = StringUtil.isPalindrome(data);
        assertTrue(result, "JAVA READS IT SAME");
    }

}