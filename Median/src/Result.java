import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {

    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
//        for(int i = 0; i < arr.size(); i++) {
//            int lover = 0;
//            int higher = 0;
//            for(int j = 0; j < arr.size(); j++) {
//                if(arr.get(i) >= arr.get(j)) {
//                    higher++;
//                } else {
//                    lover++;
//                }
//            }
//            higher--;
//            if(higher == lover) {
//                return arr.get(i);
//            }
//        }
//        return 0;
        List<Integer> sortedArr = arr.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedArr.get((arr.size() + 1)/2);
    }
}
