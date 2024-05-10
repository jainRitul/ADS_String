import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str = "gkeeks";
        System.out.println(leftmostRepeatingChar(str));
        System.out.println(leftmostRepeatingCharEfficient(str));
        System.out.println(leftmostRepeatingCharEfficientTwo(str));
    }
    
    static final int CHAR = 256;
    static int leftmostRepeatingCharEfficientTwo(String str){
        boolean visi[] = new boolean[CHAR];
        int res = Integer.MAX_VALUE;

        for(int i=str.length()-1;i>=0;i--){
            if(visi[str.charAt(i)]  == false)
               visi[str.charAt(i)] =true;
            else res = i;   
        }
        return res;
    }
    static int leftmostRepeatingCharEfficient(String str){
        int freq[] = new int[CHAR];
        int res = Integer.MAX_VALUE;
        Arrays.fill(freq,-1);
        for(int i=0;i<str.length();i++){
            int fi = freq[str.charAt(i)];

            if(fi == -1)
               freq[str.charAt(i)] = i;

            else
              res = Math.min(res,fi);   
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    static int leftmostRepeatingChar(String str){
       int freq[] = new int[CHAR];
       
       for(int i=0;i<str.length();i++)
        freq[str.charAt(i)]++;
       

       for(int i =0;i<str.length();i++)
       {
          if(freq[str.charAt(i)] > 1)
            return i;
          
       }return -1;
    }
}
