public class CheckForRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(checkRotation(s1,s2));
        System.out.println(checkRotationEfficient(s1,s2));
    }
    static boolean checkRotationEfficient(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        if(n!= m) return false;

        String temp = s1 + s1;

        return temp.contains(s2);
    }
    static boolean checkRotation(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        if(n!= m) return false;

        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
               if(s1.charAt((i+j)%n)  != s2.charAt(j)){
                  flag = false;
                  break;
               }
            }
            if(flag == true ) return true;
        }
        return false;
    }
}
