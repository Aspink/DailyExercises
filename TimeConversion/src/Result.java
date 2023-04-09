public class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int hours = Integer.parseInt(s.substring(0,2));
        if(hours == 12) {
            hours = 0;
        }
        if(s.substring(8).equals("PM")) {
            hours += 12;
        }
        String sHours = String.valueOf(hours);
        if (sHours.length() == 1) {
            sHours = "0".concat(sHours);
        }
        return sHours.concat(s.substring(2, 8));
    }
}
