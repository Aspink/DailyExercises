public class PalindromeIndex {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        char[] chars = s.toCharArray();
        int badIndex = -1;
        if(!isPalindrome(chars)) {
            for(int i = 0; i < chars.length()/2; i++) {
                if(chars[i] != chars[chars.length() - 1 - i]){
                    if(chars[i+1] = chars[chars.length() - 1 - i]) {
                        badIndex = i;
                    } else if (chars[i] = chars[chars.length() - 2 - i]) {
                        badIndex = chars.length() - 1 - i;
                    }
                    if(!isPalindrome(chars)) {
                        badIndex = -1;
                    }
                    return badIndex;
                }
            }
        }
        return badIndex;
    }
}
