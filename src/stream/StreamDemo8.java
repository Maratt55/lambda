package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Aльфa");
        myList.add("Бeтa");
        myList.add("Гaммa");
        myList.add("Дeльтa");
        myList.add("Kcи");
        myList.add("OМeгa");
        Stream<String> myStream = myList.stream();
        Iterator<String> itr = myStream.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
