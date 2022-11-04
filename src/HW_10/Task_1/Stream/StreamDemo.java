package HW_10.Task_1.Stream;

import HW_13.MyPair;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public int countOccurrence(List<String> inputData, String param) {
        return (int) inputData.stream()
                .filter(s -> s.equalsIgnoreCase(param))
                .count();
    }

    public List<Integer> toList(Integer[] inputData){
        return Arrays.stream(inputData)
                .toList();
    }

    public List<Integer> findUnique(List<Integer> inputData) {
        return inputData.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public void calcOccurrence(List<String> inputData){
        inputData.stream()
                .map(s -> s.toLowerCase().replaceAll("[^a-z]", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    public List<MyPair> findOccurrence(List<String> inputData){
        return inputData.stream()
                .map(s -> s.toLowerCase().replaceAll("[^a-z]", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> new MyPair(entry.getKey(), entry.getValue().intValue()))
                .toList();
    }
}
