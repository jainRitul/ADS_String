import java.util.Arrays;

public class LeftMostNonRepeatingChar {
    public static void main(String[] args) {
        String str = "gellplpxxcxcr";
        System.out.println(nonRepeatingChar(str));
        System.out.println(nonRepeatingCharEfficient(str));
    }
    static final int CHAR = 256;
    static int nonRepeatingCharEfficient(String str)
    {
        int freq[] = new int[CHAR];
        Arrays.fill(freq,-1);

        for(int i =0;i<str.length();i++){
            if(freq[str.charAt(i)] == -1) 
                 freq[str.charAt(i)] = i;
            else 
                freq[str.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for(int i =0;i<str.length();i++){
           int fi = freq[str.charAt(i)];
           if(fi >= 0){
            res = Math.min(res,fi);
           }

        }
        return (res == Integer.MAX_VALUE ) ?-1:res;

    }
    static int nonRepeatingChar(String str)
    {
        int freq[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(freq[c] == 1){
                return i;
            }
        }
        return -1;
    }
}
