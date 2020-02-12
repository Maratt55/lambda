package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail( "Лappи", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail( "Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail( "Mэpи", "555-3333", "Mary@HerbSchildt.com"));
        System.out.println(myList);

        myList.stream().forEach((a) ->
            System.out.println(a.email + " / " + a.name + " / " + a.phoneNum));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().filter((a) -> a.name.equals( "Джeймc" )).map(n -> new NamePhone(n.name, n.phoneNum));
        nameAndPhone.forEach((n) ->
            System.out.println(n.name + " / " + n.phoneNum));
    }
}
