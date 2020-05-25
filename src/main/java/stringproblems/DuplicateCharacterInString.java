package stringproblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {

    public String duplicateString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : map.keySet()) {
            if(map.get(c) > 1) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DuplicateCharacterInString d = new DuplicateCharacterInString();
        String result = d.duplicateString("Java");
        System.out.println(result);
        result = d.duplicateString("fbfb");
        System.out.println(result);
        result = d.duplicateString("aabcdce");
        System.out.println(result);
    }
}
