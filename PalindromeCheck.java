public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(paliCheck(str));
        System.out.println(paliCheckRevApproach(str));
    }
    static boolean paliCheckRevApproach(String str){
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return str.equals(s.toString());
    }
    static boolean paliCheck(String str){
        int start = 0;
        int end = str.length()-1;

        while (start <= end) {
            if(str.charAt(start) != str.charAt(end))
              return false;

            start++;
            end--;
        }
        return true;
    }
}
