package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
private String pigLatinSentence(String word) {

        Integer index = VowelUtils.getIndexOfFirstVowel(word);

        boolean startsWithVowel = VowelUtils.startsWithVowel(word);

        if (index == null)
            return word + "ay";

        if(startsWithVowel) {
            return word.substring(index) +
                    word.substring(0, index) + "way";
        } else  {
            return word.substring(index) +
                    word.substring(0, index) + "ay";
        }
    }

    // Driver code
    public String translate(String str) {
    String[] words = str.split(" ");
    StringBuilder finalString = new StringBuilder();
    int counter = words.length;
        for (String word : words) {
            finalString.append(pigLatinSentence(word));
            counter--;
            if (counter > 0) {
                    finalString.append(" ");
            }
        }
        return finalString.toString();
    }
}
