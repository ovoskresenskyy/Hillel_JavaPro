package HW_10.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProcessing<T> {

    public int countOccurrence(List<T> inputList, T occurrence) {
        return Collections.frequency(inputList, occurrence);
    }

    public List<T> toList(T[] inputArray) {
        List<T> outputList = new ArrayList<>();
        Collections.addAll(outputList, inputArray);
        return outputList;
    }

    public List<T> findUnique(List<T> inputList) {
        List<T> uniqueValues = new ArrayList<>();

        for (T value : inputList) {
            if (!uniqueValues.contains(value)) uniqueValues.add(value);
        }

        return uniqueValues;
    }

    public void calcOccurrence(List<T> inputList) {
        List<T> uniqueValues = findUnique(inputList);

        for (T value : uniqueValues) {
            System.out.println(value + ": " + countOccurrence(inputList, value));
        }
    }

}
