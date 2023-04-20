import java.math.BigInteger;

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        n = singleSuperDigit(n);
        System.out.println(n);
        return 1;
    }
    public static String singleSuperDigit(String s) {
        char[] chars = s.toCharArray();
        BigInteger sum = BigInteger.ZERO;
        for(char ch : chars) {
            sum.add(BigInteger.valueOf(Character.getNumericValue(ch)));
        }
        s = sum.toString();
        if(s.length() > 1) {
            s = singleSuperDigit(s);
        }
        return s;
    }
}
