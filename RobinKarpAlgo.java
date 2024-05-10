
public class RobinKarpAlgo {
    public static void main(String[] args) {
        String txt = "AAAAAA";
        String pat = "AAA";
        RBKarp(txt,pat,txt.length(),pat.length());
    }
    static final int d =256;
    static final int q =101;

    static void RBKarp(String txt,String pat,int n,int m)
    {
        int h = 1;
        for(int i=1;i<=m-1;i++)
          h = (h * d)%q;
        
        int t=0,p=0;
        for(int i=0;i<m;i++){
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }  

        for(int i=0;i<= (n-m);i++){
            if(p==t){
                boolean flag = true;
               
                for(int j = 0;j<m;j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                      flag = false;
                      break;
                    }
                }
                if(flag == true) System.out.print(i+" ");
            }

            if(i < n-m){
                t = ((d*(t - txt.charAt(i)*h)) + txt.charAt(i+m))%q;
            }
            if(t<0) t = t+q;
        }
    }
    
}