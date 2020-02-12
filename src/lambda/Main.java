package lambda;

public class Main {
    public static void main(String[] args) {
        /*lambda.MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random();
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());*/

        NumericTest isEven = (n) -> (n % 2) == 0;
        System.out.println(isEven.test(6));
        System.out.println(isEven.test(5));

        NumericTest isNonNeg = n -> n >= 0;
        System.out.println(isNonNeg.test(2));
        System.out.println(isNonNeg.test(-2));
    }
}
