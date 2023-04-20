import java.math.BigInteger;

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        n = singleSuperDigit(n);
        System.out.println(n);
        return Character.getNumericValue(n.charAt(0));
    }
    public static String singleSuperDigit(String s) {
        char[] chars = s.toCharArray();
        BigInteger sum = BigInteger.ZERO;
        for(char ch : chars) {
            sum = sum.add(BigInteger.valueOf(Character.getNumericValue(ch)));
        }
        s = sum.toString();
        System.out.println(s);
        if(s.length() > 1) {
            s = singleSuperDigit(s);
        }
        return s;
    }
}
