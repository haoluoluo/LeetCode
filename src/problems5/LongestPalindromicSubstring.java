package problems5;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        if(s==null || s.length() < 1) return "";
        int start=0,end=0;
        for(int i = 0;i<s.length();i++){
            int len1 = this.extendTo(s,i,i);
            int len2 = this.extendTo(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > (end - start)){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end + 1);
    }

    private int extendTo(String s, int i, int j) {
        int L = i;
        int R = j;
        while((L >= 0) && (R < s.length()) && (s.charAt(L) == s.charAt(R))){
            L--;
            R++;
        }
        return R-L-1;
    }

    public static void main(String[] args) {
       LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("bb"));
    }
}
