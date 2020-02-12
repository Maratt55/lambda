package lambda;

public class VarCapture {
    static int nums = 10;

    public static void main(String[] args) {

        MyFunction myLambda = (n) -> {
            int v = nums + n;
            return v;
        };
        System.out.println(myLambda.func(5));
        nums++;
        System.out.println(nums);
    }
}
