import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

    public int romanToInt(String s) {
        Map<Character, Integer> dic = new HashMap<Character, Integer>();
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            if(dic.get(s.charAt(i)) < dic.get(s.charAt(i+1))){
                char c = s.charAt(i);
                char c2 = s.charAt(i+1);
                if ((c == 'C' && (c2 == 'M' || c2 =='D')) ||
                        (c == 'X' && (c2 == 'C' || c2 =='L')) ||
                        (c == 'I' && (c2 == 'X' || c2 =='V'))) {
                    res -= dic.get(s.charAt(i));
                }else{
                    res += dic.get(s.charAt(i));
                }

            }else {
                res += dic.get(s.charAt(i));
            }
        }
        if(s.length()>0){
            res += dic.get(s.charAt(s.length()-1));
        }
        return res;
    }

    public static void main(String[] args) {
        Roman2Integer r = new Roman2Integer();
        System.out.println(r.romanToInt("MCMXCIV"));
    }
}
