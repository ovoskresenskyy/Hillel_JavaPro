package HW_13;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookParser_Stream {

    public Map<String, Integer> words = new HashMap<>();

    public void startParser(File book){

        readBook(book);
    }

    private void readBook(File book) {

        try(FileReader fr = new FileReader(book);
            BufferedReader bfr = new BufferedReader(fr)){

            bfr.lines()
                    .map(line -> line.trim().toLowerCase().split("\\s+"))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted((Map.Entry<String, Long> first, Map.Entry<String, Long> second) -> (int) (second.getValue() - first.getValue()))
                    .limit(10)
                    .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " -> " + stringLongEntry.getValue()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
