package HW_10.Task_1;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        ListProcessing<String> stringListProcessing = new ListProcessing<>();
        ListProcessing<Integer> integerListProcessing = new ListProcessing<>();

        // Task # 1
        String[] nationalSalute = "Glory to Ukraine! Glory to the heroes! Glory of the nation! Death to the enemies!".split(" ");
        List<String> listOfWords = new ArrayList<>(Arrays.asList(nationalSalute));
        System.out.println(stringListProcessing.countOccurrence(listOfWords, "Glory"));
        System.out.println();

        // Task # 2
        Integer[] independenceDay = {1, 9, 9, 1, 0, 8, 2, 4};
        List<Integer> independenceDayAsList = integerListProcessing.toList(independenceDay);
        System.out.println(independenceDayAsList);
        System.out.println();

        // Task # 3
        System.out.println(integerListProcessing.findUnique(independenceDayAsList));
        System.out.println();

        // Task # 4
        stringListProcessing.calcOccurrence(listOfWords);
        System.out.println();

    }

}
