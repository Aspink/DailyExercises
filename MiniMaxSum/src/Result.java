import java.util.*;
public class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0L;
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
