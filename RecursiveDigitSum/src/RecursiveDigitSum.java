import java.math.BigInteger;

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        String s = "";
        n = singleSuperDigit(n);
        for(int i = 1; i <= k; i++) {
            s = s.concat(n);
        }
        n = singleSuperDigit(s);
        return Character.getNumericValue(n.charAt(0));
    }
    public static String singleSuperDigit(String s) {
        char[] chars = s.toCharArray();
        BigInteger sum = BigInteger.ZERO;
        for(char ch : chars) {
            sum = sum.add(BigInteger.valueOf(Character.getNumericValue(ch)));
        }
        s = sum.toString();
        if(s.length() > 1) {
            s = singleSuperDigit(s);
        }
        return s;
    }
}
