package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail( "Лappи", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail( "Джeймc", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail( "Mэpи", "555-3333", "Mary@HerbSchildt.com"));
        System.out.println(myList);

        Stream<NamePhone> nameAndPhone = myList.stream().map((n) -> new NamePhone(n.name, n.phoneNum));
        List<NamePhone> list = nameAndPhone.collect(Collectors.toList());
        System.out.println("List: ");
        for (NamePhone n : list){
            System.out.println(n.name + ": " + n.phoneNum);
        }
        System.out.println();

        nameAndPhone = list.stream().map((a) -> new NamePhone(a.name, a.phoneNum));
        Set<NamePhone> set = nameAndPhone.collect(Collectors.toSet());
        for (NamePhone n : set){
            System.out.println(n.name + ": " + n.phoneNum);
        }
    }
}
