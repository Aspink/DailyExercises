import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q).forEach(qItr -> {
        try {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> matrix = new ArrayList<>();

            IntStream.range(0, 2 * n).forEach(i -> {
                try {
                    matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int result = MatrixFlipper.flippingMatrix(matrix);

            System.out.println(result);
            System.out.println();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    });

    bufferedReader.close();
}
}