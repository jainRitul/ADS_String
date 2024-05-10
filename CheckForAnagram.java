import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String[] args) {
        String s1 = "baa";
        String s2 = "aab";

        System.out.println(angramCheck(s1,s2));
        System.out.println(angramCheckSort(s1,s2));
    }
    static boolean angramCheckSort(String s1,String s2){
           char a1[] = s1.toCharArray();
           char a2[] = s2.toCharArray();

           Arrays.sort(a1);
           Arrays.sort(a2);

           s1 = new String(a1);
           s2 = new String(a2);

           return s1.equals(s2);
    }
    static final int CHAR = 256;
    static boolean angramCheck(String s1,String s2)
    {
          int freq[] = new int[256];
          int n = s1.length();
          int m = s2.length();
 
          if(n != m) return false;

          for(int i=0;i<n;i++){
            freq[s1.charAt(i) -'a']++;
            freq[s2.charAt(i) -'a']--;
          }
         
         for(int i=0;i<CHAR;i++)
            if(freq[i] != 0) return false;
          
          return true;
    }
}
