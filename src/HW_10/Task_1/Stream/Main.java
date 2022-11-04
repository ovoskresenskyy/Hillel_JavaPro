package HW_10.Task_1.Stream;

import HW_13.MyPair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] nationalSalute = "Glory to Ukraine! Glory to the heroes! Glory of the nation! Death to the enemies!".split(" ");
        List<String> listOfWords = new ArrayList<>(Arrays.asList(nationalSalute));
        Integer[] independenceDay = {1, 9, 9, 1, 0, 8, 2, 4};

        StreamDemo streamDemo = new StreamDemo();

        // ** task 1
        int count = streamDemo.countOccurrence(listOfWords, "glory");
        System.out.println(count);

        // ** task 2
        List<Integer> integers = streamDemo.toList(independenceDay);
        System.out.println("integers = " + integers);

        // ** task 3
        List<Integer> unique = streamDemo.findUnique(integers);
        System.out.println("unique = " + unique);

        // ** task 4
        streamDemo.calcOccurrence(listOfWords);

        // ** task 5
        List<MyPair> occurrence = streamDemo.findOccurrence(listOfWords);
        System.out.println("occurrence = " + occurrence);
    }
}
