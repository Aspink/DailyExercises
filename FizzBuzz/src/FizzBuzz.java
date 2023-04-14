public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++){
            String output = "";
            if(i%3 == 0) {
                output = output.concat("Fizz");
            }
            if(i%5 == 0) {
                output = output.concat("Buzz");
            }
            if(output.length() == 0) {
                output = output.concat(String.valueOf(i));
            }
            System.out.println(output);
        }

    }
}
