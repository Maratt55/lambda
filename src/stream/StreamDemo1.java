package stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println(myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println(minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compareTo);
        if (maxVal.isPresent())
            System.out.println(maxVal.get());
        System.out.println();

        Stream<Integer> sortedStream = myList.stream().sorted();
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        oddVals.forEach((n) -> System.out.print(n + " "));
    }
}
