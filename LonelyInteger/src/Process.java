import java.util.List;

public class Process {
    public static int lonelyInteger(List<Integer> a) {
        Integer result = a.stream()
                .filter(i -> a.indexOf(i) ==  a.lastIndexOf(i))
                .findFirst().get();
        return result;
    }
}
