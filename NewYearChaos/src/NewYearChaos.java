import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for(int i = 0; i < q.size(); i++) {
            if(q.get(i) - i - 1 > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if(q.get(j) > q.get(i)) bribes++;
            }
        }
        System.out.println(bribes);
    }

}
