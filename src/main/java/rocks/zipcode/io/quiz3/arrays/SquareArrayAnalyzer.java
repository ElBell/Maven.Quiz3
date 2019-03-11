package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        for (Integer integer : input) {
            if(!isSqaure(integer, squaredValues)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSqaure(Integer integer, Integer[] squaredValues) {
        for (Integer squaredValue : squaredValues) {
            if(integer == squaredValue || integer*integer == squaredValue) {
                return true;
            }
        }
        return false;
    }
}
