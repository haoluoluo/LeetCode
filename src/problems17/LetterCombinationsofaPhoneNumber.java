package problem17;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
   public List<String> letterCombinations(String digits) {
       LinkedList<String> ans = new LinkedList<String>();
       if(digits.length()<=0){
           return ans;
       }
       String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
       ans.add("");
       while (ans.peek().length()!=digits.length()){
           String remove = ans.pop();
           String map = mapping[digits.charAt(remove.length())-'0'];
           for(char c : map.toCharArray()){
               ans.addLast(remove+c);
           }
       }

       return ans;
    }
}
