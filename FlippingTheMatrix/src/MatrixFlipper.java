import java.util.List;

public class MatrixFlipper {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size()/2;
        int sum = 0;
        for(int i =0; i<n; i++) {
            for(int j = 0; j < n; j++) {
                sum += max(matrix, i, j);
            }
        }
        return sum;
    }

    public static int max(List<List<Integer>> matrix, int i, int j) {
        int indexMax = matrix.size() - 1;
        return Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(indexMax - j)), Math.max(matrix.get(indexMax - i).get(j), matrix.get(indexMax - i).get(indexMax - j)));
    }

}
