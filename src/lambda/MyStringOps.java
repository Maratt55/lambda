package lambda;

public class MyStringOps {

    String strRevers(String str) {
        String resault = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resault += str.charAt(i);
        }
        return resault;
    }
}
