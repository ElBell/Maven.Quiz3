package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType someType : array) {
            if (getNumberOfOccurrences(someType) % 2 != 0) {
                return someType;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType someType : array) {
            if (getNumberOfOccurrences(someType) % 2 == 0) {
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Collections.frequency(Arrays.asList(array), valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> arrayAsObjects = Arrays.stream(array).filter(predicate::apply).collect(Collectors.toList());
        SomeType[] finalArray = array.clone();
        int index = 0;
        for (SomeType arrayAsObject : arrayAsObjects) {
            finalArray[index] = arrayAsObject;
            index++;
        }
        return  Arrays.copyOfRange(finalArray, 0, index);
    }
}
