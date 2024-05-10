public class MethodOfString {
    public static void main(String[] args) {
        String s = "geeks";
        String s1 = new String("geeks");
        StringBuilder s2 = new StringBuilder("rituljain");
        StringBuffer s3 = new StringBuffer("rituljain");
        
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s.length());
        System.out.println(s.contains("l"));
        System.out.println(s.indexOf("k"));

    }
}
