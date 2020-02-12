package lambda;

public class InstanceMethWithObjectRefDemo {

   /* static <T> int counter(T[] vals, lambda.MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        lambda.HighTemp[] weekDayHighs = {new lambda.HighTemp(89), new lambda.HighTemp(82),
                new lambda.HighTemp(90), new lambda.HighTemp(89),
                new lambda.HighTemp(89), new lambda.HighTemp(91),
                new lambda.HighTemp(84), new lambda.HighTemp(83)};

        lambda.HighTemp[] weekDayHighs2 = { new lambda.HighTemp (32) , new lambda.HighTemp(12),
                new lambda.HighTemp (24), new lambda.HighTemp(19),
                new lambda.HighTemp (18), new lambda.HighTemp(12),
                new lambda.HighTemp (-1), new lambda.HighTemp (13) };

        int count = counter(weekDayHighs, lambda.HighTemp::sameTemp, new lambda.HighTemp(89));
        System.out.println(count);

        count = counter(weekDayHighs2, lambda.HighTemp::lessThanTemp, new lambda.HighTemp(19));
        System.out.println(count);
    }*/
}
