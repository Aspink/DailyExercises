import java.util.List;

public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        int n = petrolpumps.size();
        int start = 0;
        int fuel = 0;
        int i = 0;
        while(i < n) {
            fuel += petrolpumps.get(i).get(0);
            if(fuel >= petrolpumps.get(i).get(1)) {
                fuel -= petrolpumps.get(i).get(1);
                i++;
            } else {
                start = i + 1;
                fuel = 0;
                i = start;
            }
        }
        return start;
    }
}
