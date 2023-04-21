import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for(int i = 0; i < q.size(); i++) {
            int personBribes = q.get(i) - i;
            if(personBribes < 0) personBribes = 0;
            if(personBribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            bribes += personBribes;
        }
        System.out.println(bribes);
        return;
    }

}
