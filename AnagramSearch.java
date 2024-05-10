public class AnagramSearch {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";

        System.out.println(anagram(txt,pat));
        System.out.println(anagramEfficient(txt,pat));
    }
    static final int CHAR = 256;
    static boolean anagramEfficient(String txt , String pat){
        int CT[] = new int[CHAR];
        int CP[] = new int[CHAR];
        for(int i = 0;i<pat.length();i++)
        {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }

        for(int i = pat.length();i<txt.length();i++){
            if(areSame(CT,CP)) return true;

            CT[txt.charAt(i)]++;
            CT[txt.charAt(i - pat.length())]--;
        }
        return false;

    }
    static boolean areSame(int CT[],int CP[]){
        for(int i =0;i<CHAR;i++)
        {
            if(CT[i] != CP[i]) return false;
        }return true;
    }
    static boolean anagram(String txt , String pat){
        int n = txt.length();
        int m = pat.length();
        
        for(int i=0;i<=n-m;i++){
            if(checkAnagram(pat,txt,i))return true;
        }
        return false;
    }
    static boolean checkAnagram(String pat , String txt,int i){
        int freq[] = new int[256];
        for(int j=0;j<pat.length();j++){
            freq[pat.charAt(j)]++;
            freq[txt.charAt(i+j)]--;
        }
        for(int j=0;j<256;j++){
            if(freq[j] != 0){
                return false;
            }
        }
        return true;
    }
}
