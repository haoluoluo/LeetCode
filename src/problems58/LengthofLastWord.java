package problems58;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length()<1){
            return 0;
        }
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' ') i--;
        int res = 0;
        for(;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            res++;
        }
        return res;
    }
}
