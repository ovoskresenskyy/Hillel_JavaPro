package HW_10.Task_1;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        String[] nationalSalute = "Glory to Ukraine! Glory to the heroes! Glory of the nation! Death to the enemies!".split(" ");

        List<String> listOfWords = new ArrayList<>(Arrays.asList(nationalSalute));
        System.out.println(countOccurrence(listOfWords, "Glory"));

    }

    public static int countOccurrence(List<String> incomeList, String occurrence) {
        return Collections.frequency(incomeList, occurrence);
    }
}
