public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        int badIndex = -1;
        if(!isPalindrome(s)) {
            for(int i = 0; i <= s.length()/2; i++) {
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    if(isPalindrome(stringRemove(s, i))) {
                        badIndex = i;
                    } else if (isPalindrome(stringRemove(s, s.length() - 1 - i))) {
                        badIndex = s.length() - 1 - i;
                    }
                    return badIndex;
                }
            }
        }
        return badIndex;
    }

    public static  boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

}
