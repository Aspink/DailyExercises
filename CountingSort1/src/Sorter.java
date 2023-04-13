import java.util.ArrayList;
import java.util.List;

public class Sorter {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> count = new ArrayList<>();
        for(Integer i = 0; i < 100; i++) {
            count.add(0);
        }
        for(Integer number : arr) {
            count.set(number, count.get(number) + 1);
        }
        return count;
    }
}
