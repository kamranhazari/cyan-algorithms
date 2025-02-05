package utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringUtil {
    /**
     * the last 4 (four) characters before the marker position should distinguish to each other
     * lowerCase of characters are considered only!
     *
     * @param inputData the sequence of characters to find the Marker position
     * @return the position of Marker within the sequence where the unique 4chars are found
     **/
    public static int indexOfMarker(String inputData) {
        inputData = inputData.toLowerCase();
        //it's always after the 4th character
        for (int i = 3; i < inputData.length(); i++) {
            char c1 = inputData.charAt(i - 3);
            char c2 = inputData.charAt(i - 2);
            char c3 = inputData.charAt(i - 1);
            char c4 = inputData.charAt(i);

            // Store characters in a HashSet to automatically check for duplicates
            Set<Character> uniqueChars = new HashSet<>();
            uniqueChars.add(c1);
            uniqueChars.add(c2);
            uniqueChars.add(c3);
            uniqueChars.add(c4);

            // If the set size is 4, there are no duplicates
            if (uniqueChars.size() == 4) {
                return i + 1;//return position not index!
            }
        }
        return -1;
    }

    /**
     * check if the given String reads the same backwards as forwards.
     * lowerCase of characters are considered only!
     *
     * @param inputData the sequence of characters to check back/forward reading is same
     * @return true if JAVA can read it forward same as backward ;)
     **/
    public static boolean isPalindrome(String inputData) {
        inputData = inputData.toLowerCase();
        return isPalindromeRec(inputData, 0, inputData.length() - 1);
    }

    private static boolean isPalindromeRec(String inputData, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (inputData.charAt(left) != inputData.charAt(right)) {
            return false;
        }
        return isPalindromeRec(inputData, left + 1, right - 1);
    }

    /**
     * check if both given Strings are made of same exact characters.
     * lowerCase of characters are considered only!
     * <p>
     * Note this method uses parallelSort as for time complexity it should be considered far large sized
     * strings (https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
     *
     * @param firstString  the sequence of characters to check back/forward reading is same
     * @param secondString the sequence of characters to check back/forward reading is same
     * @return true if JAVA says both have same characters ;)
     **/
    public static boolean isAnagram(String firstString, String secondString) {
        //normalize inputs and remove space,tab and newline
        firstString = firstString.toLowerCase().replaceAll("\\s", "");
        secondString = secondString.toLowerCase().replaceAll("\\s", "");

        if (firstString.length() != secondString.length()) return false;

        var chArr1 = firstString.toCharArray();
        var chArr2 = secondString.toCharArray();

        //chnage to Arrays.sort() for small sized strings
        Arrays.parallelSort(chArr1);
        Arrays.parallelSort(chArr2);

        return Arrays.equals(chArr1, chArr2);
    }

}
