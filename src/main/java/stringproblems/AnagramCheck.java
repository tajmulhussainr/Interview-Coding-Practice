package stringproblems;
// https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html
public class AnagramCheck {
    public static boolean isAnagram(String word, String anagram) {
        StringBuilder sb = new StringBuilder(anagram);

        for(char ch : word.toCharArray()) {
            int index = sb.indexOf(String.valueOf(ch));
            if(index>=0) sb.deleteCharAt(index);
            else return false;
        }
        return sb.length() == 0;
    }

    public static void  main(String[] args) {
        boolean result = isAnagram("star", "arts");
        System.out.println(result);
        result = isAnagram("stars", "arts");
        System.out.println(result);
    }
}
