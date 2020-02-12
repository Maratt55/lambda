package lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        NumericFunc<Integer> factorial = (n) -> {
            int resault = 1;
            for (int i = 1; i <= n; i++) {
                resault *= i;
            }
            return resault;
        };
        System.out.println(factorial.func(5));
        System.out.println(factorial.func(3));
        NumericFunc<String> revers = (str) -> {
            String resault = "";
            for (int i = str.length() - 1; i >= 0; i--)
                resault += str.charAt(i);
            return resault;
        };
        System.out.println(revers.func("Lambda"));
        System.out.println(revers.func("Hello World"));
    }
}
