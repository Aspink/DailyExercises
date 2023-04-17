public class CaesarsCode {
    public static String caesarCipher(String s, int k) {
        StringBuilder string = new StringBuilder();
        char[] chars = s.toCharArray();
        for(char letter : chars) {
            if(Character.isLetter(letter)) {
                if(letter >= 'a' && letter <= 'z') {
                    letter = (char) (((letter + k - 'a') % 26) + 'a');
                }
                if(letter >= 'A' && letter <= 'Z') {
                    letter = (char) (((letter + k - 'A') % 26) + 'A');
                }
            }
            string.append(letter);
        }
        return string.toString();
    }
}
