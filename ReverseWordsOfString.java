import java.util.Stack;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String str = "I LOVE CODING";
        reveseWordsOfString(str);
        reveseWordsOfStringInPlace(str);
        reveseWordsOfStringNotInPlace(str);
        System.out.println(str);
    }
    static void reveseWordsOfStringInPlace(String str){
        char a[] = str.toCharArray();
        int n = str.length();
        int start =0;
        for(int i =0;i<n;i++)
        {
            if(a[i] == ' '){
                reverseWord(a,start,i-1);
                start = i+1;
            }
        }
        reverseWord(a,start,n-1);
        reverseWord(a,0,n-1);
        str = new String(a);
        System.out.println(str);
        }
    static void reverseWord(char []str , int low,int high){
        while(low <= high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;

        }
    }
    static void reveseWordsOfStringNotInPlace(String str){
        String rev = "";
        int lastInd = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                rev = ' '+ str.substring(lastInd, i) + rev ;
                lastInd = i+1;
                
            }
        }rev = str.substring(lastInd) + rev;
        rev.trim();
        System.out.println(rev);
    }
    static void reveseWordsOfString(String str){
        Stack<String>s = new Stack<>();
        int lastInd = 0;
        for(int i=0;i<str.length();i++)
        {
         
            if(str.charAt(i) == ' '){
                s.push(str.substring(lastInd, i));
                lastInd  = i+1;
            }
        }
        s.push(str.substring(lastInd));
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
            
        
    }
}
