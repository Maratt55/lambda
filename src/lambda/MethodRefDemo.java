package lambda;

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        MyStringOps myStringOps = new MyStringOps();
        outStr = stringOp(myStringOps::strRevers, inStr);
        System.out.println(outStr);
    }
}
