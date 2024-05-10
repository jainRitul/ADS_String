public class KMPLpsArr {
    public static void main(String[] args) {
        String str = "abacabad";
        int LPS[] = new int[str.length()];
        fillLps(LPS,str);
        for(int i=0;i<str.length();i++){
            System.out.print(LPS[i]+" ");
        }
    }
    static void fillLps(int LPS[],String str){
        int n = str.length();
        int len = 0;
        LPS[0]  = 0;
        int i=1;
        while (i<n) {
            if(str.charAt(i) == str.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }
            else{
                if(len==0) {LPS[i] = 0;i++;}
                else len = LPS[len-1];
            }
            
        }
    }

}
