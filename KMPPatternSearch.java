
public class KMPPatternSearch {

    public static void main(String[] args) {
        String txt = "aaaaaaaaa";
        String pat = "aaa";
        KmpSearch(txt,pat);
    }
    static void KmpSearch(String txt,String pat){
        int n = txt.length();
        int m = pat.length();

        int lps[] = new int[m];
        fillLps(lps,pat,m);
        int i=0,j=0;
        while (i<n) {
           if(pat.charAt(j)== txt.charAt(i) ){i++;j++;} 
           if(j==m) {System.out.print(i-j + " "); j=lps[j-1];}
           else if(i<n && pat.charAt(j) != txt.charAt(i)){
                if(j==0)i++;
                else j = lps[j-1];
           }
        }
    }
    static void fillLps(int lps[],String pat,int m)
    {
       int len = 0;
       lps[0] = 0;

       int i = 1;
       while (i<m) {
           if(pat.charAt(i) == pat.charAt(len)){
            len ++;
            lps[i] = len;
            i++;
           }
           else {
            if(len==0){
                lps[i] = 0;
                i++;
            }
            else{
                len = lps[len-1];
            }
           }
       }
    }

}