package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String stringLower = str.toLowerCase();
        List<String> wave = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String newWave = makeWave(stringLower, i);
            if (newWave != null) {
                wave.add(makeWave(stringLower, i));
            }
        }
        return wave.toArray(new String[0]);
    }

    private static String makeWave(String stringLower, int i) {
        if(Character.isLetter(stringLower.charAt(i))) {
            return  stringLower.substring(0, i) +
                    Character.toUpperCase(stringLower.charAt(i)) +
                    stringLower.substring(i + 1);
        } else {
            return null;
        }
    }

}
