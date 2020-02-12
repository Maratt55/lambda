package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {

    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> arrayList = new ArrayList<>();
        arrayList.add(new MyClass(11));
        arrayList.add(new MyClass(4));
        arrayList.add(new MyClass(2));
        arrayList.add(new MyClass(9));
        arrayList.add(new MyClass(3));
        arrayList.add(new MyClass(7));

        MyClass maxValObj = Collections.max(arrayList, UseMethodRef::compareMC);
        System.out.println(maxValObj.getVal());
    }
}
