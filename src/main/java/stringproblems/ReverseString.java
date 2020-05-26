package stringproblems;

public class ReverseString {

    public String reverse(String str) {
        if(str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("Java"));
    }
}
