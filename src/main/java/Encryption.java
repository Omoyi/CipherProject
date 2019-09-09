
//public class Encryption {
//    public String Encrypt(String input, int key) {
//        StringBuilder chWord = new StringBuilder(input);
//        String alphabet = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
//        String alphabet2 = alphabet.toLowerCase();
//        String keyword = alphabet.substring(key) + alphabet.substring(0, key);
//        for (int j = 0; j < chWord.length(); j++) {
//            char currChar = chWord.charAt(j);
//            int index = alphabet.indexOf(currChar);
//            if (index != -1) {
//                char newChar = keyword.charAt(index);
//                chWord.setCharAt(j, newChar);
//            }
//            index = alphabet2.indexOf(currChar);
//            if (index != -1) {
//                String keyword2 = keyword.toLowerCase();
//                char newChar = keyword2.charAt(index);
//                chWord.setCharAt(j, newChar);
//            }
//        }
//        return chWord.toString();
//    }
//}

import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Encryption {

    private static final int ALPHABET_SIZE = 26;

    public Scanner cipher(String message, int rotateBy) {
        // rotate by only the size of the alphabet:
        rotateBy %= ALPHABET_SIZE;
        char[] chars = message.toCharArray();
        rotate(chars, rotateBy);

        System.out.println("a word");
        Scanner  myScn = new Scanner(String.valueOf(chars));
        return myScn;
    }

    private void rotate(char[] chars, int rotateBy) {
        for (int i = 0; i < chars.length; ++i) {
            if (isLowerCase(chars[i])) {
                chars[i] = rotateChar(chars[i], rotateBy, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] = rotateChar(chars[i], rotateBy, 'A', 'Z');
            }
        }
    }

    private char rotateChar(char c, int rotateBy, char firstChar, char lastChar) {
        c += rotateBy;
        if (c < firstChar) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > lastChar) {
            return (char) (c - ALPHABET_SIZE);
        }

        return c;
    }
}