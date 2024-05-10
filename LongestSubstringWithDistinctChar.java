import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubstringWithDistinctChar {
    public static void main(String[] args) {
        String str = "abcadbd";
        System.out.println(lengthOfLongestSubstr(str));
        System.out.println(lengthOfLongestSubstrApproachTwo(str));
        System.out.println(lengthOfLongestSubstrApproachEfficient(str));
    }
    static int lengthOfLongestSubstrApproachEfficient(String str){
        int i =0;
        int res = 0;
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        for(int j=0;j<str.length();j++){
            i = Math.max(i, prev[str.charAt(j)] + 1);
            int maxEnd = j-i+1;
            res = Math.max(res, maxEnd);
            prev[str.charAt(j)] = j;
        }
        return res;
    }
    static int lengthOfLongestSubstrApproachTwo(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean visi[] = new boolean[256];
            for(int j=i;j<n;j++){
                 if(visi[str.charAt(j)] == true) break;
                 else{
                    res = Math.max(res,j-i+1);
                    visi[str.charAt(j)] = true;
                 }
            }
        }return res;
    }
    static int lengthOfLongestSubstr(String str){
        int n = str.length();
        int res = 0;
        if(n==0) return res;
         
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isDistinct(str,i,j))
                   res = Math.max(res, j-i+1);
            }
        }
        return res;

    }
    static boolean isDistinct(String str,int i,int j){
        boolean visi[] = new boolean[256];

        for(int k=i;k<=j;k++){
           if(visi[str.charAt(k)])
             return false;
            visi[str.charAt(k)] = true;

        }   
        return true;

    }
}
