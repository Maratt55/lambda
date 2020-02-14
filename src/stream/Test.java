package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.stream().filter(x -> x.equals("one")).forEach(x -> System.out.println(x));
        Set<String> set =  list.stream().map(s -> s + "/").collect(Collectors.toSet());
        set.stream().forEach(x -> System.out.print(x));
        System.out.println();
        list.stream().map(String::toUpperCase).peek((e) -> System.out.print(e + ",")).collect(Collectors.toList());

    }
}
