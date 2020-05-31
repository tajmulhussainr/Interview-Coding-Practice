package stringproblems;
// https://javarevisited.blogspot.com/2012/01/how-to-reverse-string-in-java-using.html
public class ReverseString {

    public String reverseUsingRecursion(String str) {
        if(str.length() < 2) {
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseUsingRecursion("Tajmul"));
        System.out.println(rs.reverse("Java"));
    }
}
