import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        String answer = "YES";
        List<String> newGrid = new ArrayList<>();
        for(String row : grid) {
            newGrid.add(sort(row));
        }
        for(int i = 0; i <  grid.get(0).length(); i++) {
            for(int j = 0; j < grid.size() - 1; j++) {
                if(newGrid.get(j).charAt(i) > newGrid.get(j + 1).charAt(i)) {
                    return "NO";
                }
            }
        }
        return answer;
    }
    public static String sort(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
