import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import static java.util.stream.Collectors.joining;
import java.util.*;
import java.util.stream.*;
public class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        long pluses = arr.stream()
                .filter(n -> n > 0)
                .count();
        long minuses = arr.stream()
                .filter(n -> n < 0)
                .count();
        long zeroes = arr.stream()
                .filter(n -> n == 0)
                .count();
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format((double)pluses / arr.size()));
        System.out.println(df.format((double)minuses / arr.size()));
        System.out.println(df.format((double)zeroes / arr.size()));
    }
}
