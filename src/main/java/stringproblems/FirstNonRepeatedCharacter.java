package stringproblems;

import java.util.HashMap;
import java.util.Map;
// https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html
public class FirstNonRepeatedCharacter {
    public static char firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            if(map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch,++count);
            } else {
                map.put(ch,1);
            }
        }

        for (char ch : str.toCharArray()) {
            if(map.get(ch) == 1) return ch;
        }

        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("java"));
        System.out.println(firstNonRepeatedCharacter("javaj"));
    }
}
