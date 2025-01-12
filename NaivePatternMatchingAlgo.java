public class NaivePatternMatchingAlgo {
    public static void main(String[] args) {
        String txt = "abababcd";
        String pat = "abab";

        patternSearch(txt,pat);
    }
    static void patternSearch(String txt , String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<= n-m;){
            int j=0;
            for( j=0;j<m;j++){
                if(txt.charAt(i+j) != pat.charAt(j))
                   break;
            }
            if(j==m) {
                System.out.println(i);
            }
            if(j==0) i++;
            else i = i+j;
        }
    }
}
