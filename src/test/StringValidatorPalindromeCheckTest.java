package test;

import main.java.com.cyanapp.assignment.task1.utility.StringValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringValidatorPalindromeCheckTest {
    @Test
    public void testisPalindrome_WithCyanString() {
        // Test Cyan strings

        assertTrue(StringValidator.isPalindrome("rAcecaR"), "JAVA READS IT SAME");
        assertTrue(StringValidator.isPalindrome("radar"), "JAVA READS IT SAME");
        assertFalse(StringValidator.isPalindrome("fail"), "JAVA DOESNT READ IT AS SAME");
    }

    @Test
    public void testisPalindrome_WithAllSameChars() {
        // Test where all similar characters
        String data = "11111";
        boolean result = StringValidator.isPalindrome(data);
        assertTrue(result, "JAVA READS IT SAME");
    }

    @Test
    public void testisPalindrome_WithEmptyString() {
        // Test an empty string
        String data = "";
        boolean result = StringValidator.isPalindrome(data);
        assertTrue(result, "JAVA READS IT SAME");
    }

}