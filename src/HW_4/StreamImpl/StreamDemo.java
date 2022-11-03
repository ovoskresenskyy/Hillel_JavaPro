package HW_4.StreamImpl;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public void printThreeWords(){
        String[] words = {"Orange", "Banana", "Apple"};
        Arrays.stream(words)
                .forEach(System.out::println);
    }

    public void checkSumSign(){
        OptionalInt reduce = IntStream.of(5, -6)
                .reduce((x, y) -> {
                    if ((x + y) >= 0) System.out.println("sum +");
                    else System.out.println("sum -");
                    return x + y;
                });
    }

}
