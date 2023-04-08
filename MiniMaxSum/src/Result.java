import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        Integer sum = 0;
        Integer xMin = arr.get(0);
        Integer xMax = xMin;
        for(Integer x : arr) {
            if(x < xMin) {
                xMin = x;
            }
            if(x > xMax) {
                xMax = x;
            }
            sum += x;
        }
        System.out.println((sum - xMax) + " "  + (sum - xMin));
    }
}
