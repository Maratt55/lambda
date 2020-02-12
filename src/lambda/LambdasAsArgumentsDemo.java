package lambda;

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println(outStr);

        outStr = stringOp((str) -> {
            String resault = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    resault += str.charAt(i);
            }
            return resault;
        }, inStr);
        System.out.println(outStr);

        StringFunc reverse = (str) -> {
            String resault = "";
            for (int i = str.length() - 1; i >= 0; i--)
                resault += str.charAt(i);
            return resault;
        };
        System.out.println(stringOp(reverse, inStr));
    }
}
