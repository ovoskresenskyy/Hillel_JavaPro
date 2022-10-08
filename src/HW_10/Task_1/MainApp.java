package HW_10.Task_1;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        // Task # 1
        String[] nationalSalute = "Glory to Ukraine! Glory to the heroes! Glory of the nation! Death to the enemies!".split(" ");
        List<String> listOfWords = new ArrayList<>(Arrays.asList(nationalSalute));
        System.out.println(countOccurrence(listOfWords, "Glory"));

        // Task # 2
        Integer[] independenceDay = {1, 9, 9, 1, 0, 8, 2, 4};
        System.out.println(toList(independenceDay));

    }

    public static int countOccurrence(List<String> incomeList, String occurrence) {
        return Collections.frequency(incomeList, occurrence);
    }

    public static List<Integer> toList(Integer[] incomeArray){
        List<Integer> outputList = new ArrayList<>();
        Collections.addAll(outputList, incomeArray);
        return outputList;
    }
}
