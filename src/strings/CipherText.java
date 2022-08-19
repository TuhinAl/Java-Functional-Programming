package strings;

import java.util.ArrayList;
import java.util.List;

public class CipherText {
    public static void main(String[] args) {
        CipherText.cipherText("hzttze iiisuu stttubbb@borrrn");
//        CipherText.cipherText("aasssshe uuiiis aaa iigo@od boiiyyy");
    }

    public static String cipherText(String text) {

        char[] chars = text.toCharArray();

        List<Character> newChar = new ArrayList<>();
        int len = chars.length;
        int j = 0;
        for (  int i = 0; i < len-2;) {

            if (chars[i] == chars[i + 1]) {
                i += 2;
            } else if ((chars[i] == chars[i + 2]) && (chars[i + 1] == '@')) {
                newChar.add(chars[i]);
                newChar.add(chars[i + 2]);
                i += 3;
            } else if (i > 3) {
                if(chars[i] == chars[i-3]) {
                    newChar.remove(newChar.size()-1);
                    i++;
                }else {
                    newChar.add(chars[i]);
                    i++;
                }
            } else {
                newChar.add(chars[i]);
                i++;
            }
        }

        newChar.add(chars[len-2]);
        newChar.add(chars[len-1]);
        String replace = String.valueOf(newChar).replace(",", "").replace("  ", "");
        System.out.println("ciper word is: " +replace );
    return replace;
    }
}
