import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for(int i = 0; i < q.size() - 1; i++) {
            int personBribes = 0;
            for(int j = i + 1; j < q.size(); j++) {
                if(q.get(i) > q.get(j)) {
                    personBribes++;
                    if(personBribes > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
            bribes += personBribes;
        }
        System.out.println(bribes);
    }

}
