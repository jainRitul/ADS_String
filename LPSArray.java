public class LPSArray {
    public static void main(String[] args) {
        String str = "abbabb";
        int LPS[] = new int[str.length()];
        fillLps(str,LPS);
        for(int i=0;i<str.length();i++){
            System.out.print(LPS[i]+" ");
        }

    }
    static void fillLps(String str, int LPS[]){
        for(int i=0;i<str.length();i++){
            LPS[i] = longProperPrefixSuffix(str,i+1);
        }
    }
   static int longProperPrefixSuffix(String str,int n)
    {
        for(int len = n-1;len>0;len--)
        {  boolean flag = true;
           for(int i=0;i<len;i++){
             if(str.charAt(i) != str.charAt(n-len+i)){
                flag = false;
                break;
             }
           }
           if(flag == true) return len;
        }
        return 0;
    }
}
