package lambda;

public class ConnstruktorRefDemo {

    public static void main(String[] args) {
        MyFunc<Integer> myClassCons = MyClass<Integer>::new;
        System.out.println(myClassCons.func(100).getVal());
    }
}
