import java.util.List;

public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        boolean passed = false;
        int i = 0;
        while(!passed) {
            int fuel = 0;
            passed = true;
            for(List<Integer> pump : petrolpumps) {
                fuel += pump.get(0);
                if(fuel < pump.get(1)) {
                    passed =  false;
                    petrolpumps.add(petrolpumps.get(0));
                    petrolpumps.remove(0);
                    i++;
                    break;
                }
            }


        }
        return  i;

    }
}
