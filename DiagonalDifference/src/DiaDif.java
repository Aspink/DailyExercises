import java.util.List;

public class DiaDif {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer rightSum = 0;
        Integer leftSum = 0;
        int n = arr.size();
        for(int i =  0; i < n; i++) {
            rightSum += arr.get(i).get(i);
            leftSum += arr.get(i).get(n-1-i);
        }
        return Math.abs(rightSum - leftSum);

    }
}
