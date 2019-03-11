package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        return str.substring(0, indexToCapitalize) +
                Character.toUpperCase(str.charAt(indexToCapitalize)) +
                str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length() - i; j++) {
                String newSubstring = string.substring(i, j + i);
                if(!subStrings.contains(newSubstring)) {
                    subStrings.add(newSubstring);
                }
            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
