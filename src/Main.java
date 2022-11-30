import java.util.*;

public class Main {

    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                letter = ((Character.toString(letter)).toLowerCase()).charAt(0);
                if (!map.containsKey(letter)) {
                    map.put(letter, 1);
                } else {
                    map.put(letter, map.get(letter) + 1);
                }
            }
        }
        int max = -1;
        int min = Integer.MAX_VALUE;
        char maxLetter = 0;
        char minLetter = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isLetter(letter)) {
                letter = ((Character.toString(letter)).toLowerCase()).charAt(0);
                if (map.get(letter) > max) {
                    max = map.get(letter);
                    maxLetter = letter;
                }
                if (map.get(letter) < min) {
                    min = map.get(letter);
                    minLetter = letter;
                }
            }
        }
        System.out.println("Символ: " + maxLetter + " встречается чаще всего!\n" + "Количество встреч: " + max);
        System.out.print("Символ: " + minLetter + " встречается реже всего!\n" + "Количество встреч: " + min);
    }
}