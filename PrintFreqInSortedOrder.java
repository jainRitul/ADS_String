class PrintFreqInSortedOrder{
    public static void main(String[] args) {
        String  s = "zxyffsffmnxzkdsdj";
        printFreq(s);
    }
    static void printFreq(String s){
        int count[] = new int[26];

        for(int i=0;i<s.length();i++)
            count[s.charAt(i) - 'a']++;
        
        for(int i=0;i<26;i++){
            if(count[i] < 1){
                continue;
            }
            // like suppose o+a = 65 whose ascii value is a for char
            System.out.println(count[i] + "," + (char)(i + 'a') );
        }

    }
}