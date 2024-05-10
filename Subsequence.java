public class Subsequence {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "esfog";

        System.out.println(subsequenceOrNot(s1,s2));
        System.out.println(subsequenceOrNotRecursive(s1,s2,s1.length()-1,s2.length()-1));
    }
    static boolean subsequenceOrNotRecursive(String s1,String s2,int n,int m){
        if(m==0) return true;
        if(n==0) return false;

        if(s1.charAt(n-1) == s2.charAt(m)) 
          return   subsequenceOrNotRecursive(s1,s2,n-1,m-1);
        else
          return  subsequenceOrNotRecursive(s1,s2,n-1,m);

            
    }
    static boolean subsequenceOrNot(String s1,String s2){
        int i = 0,j=0;
        int m = s2.length();
        int n = s1.length();

        while (j < m && i<n ) {
            if(s1.charAt(i) == s2.charAt(j))
            {
                j++;
            }
            i++;
        }
      
      return (j==m);

    }
}