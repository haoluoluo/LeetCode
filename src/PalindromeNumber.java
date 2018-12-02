/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x>0){
            String s = ""+x;
            int i = s.length()-1,j=0;
            while(i>j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i--;j++;
            }
            return true;
        }
        return false;
    }
}
