public class LexicaigraphicalRank {
    public static void main(String[] args) {
        String  str = "STRING";

        System.out.println(lexRank(str));
    }
    static final int CHAR = 256;
    static int fact(int n){
        return (n<=1) ? 1:n*fact(n-1);
    }
    static int lexRank(String str){
        int n = str.length();
        int mul = fact(n);
        int count[] = new int[CHAR];
        int res = 1;
        for(int i=0;i<n;i++)
           count[str.charAt(i)]++;

        for(int i=1;i<CHAR;i++)
           count[i] += count[i-1];
        for(int i=0;i<n-1;i++){
            mul = mul/(n-i);
            res += count[str.charAt(i) - 1] * mul;
            for(int j=str.charAt(i);j<CHAR;i++)
                count[j]--;
        }     
        return res;
    }
    
}
