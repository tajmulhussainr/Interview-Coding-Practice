package stringproblems;

import java.util.HashMap;
import java.util.Map;
// https://www.java67.com/2014/03/how-to-find-duplicate-characters-in-String-Java-program.html
public class FindDuplicateCharacters {

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
        FindDuplicateCharacters d = new FindDuplicateCharacters();
        String result = d.duplicateString("Java");
        System.out.println(result);
        result = d.duplicateString("fbfb");
        System.out.println(result);
        result = d.duplicateString("aabcdce");
        System.out.println(result);
    }
}
