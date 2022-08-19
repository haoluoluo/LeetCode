package problems1;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description TODO
 * @Author haoluo
 * @Date 2022/8/19 18:19
 * @Version 1.0
 **/
public class TwoSum {
    public Integer[] twoSum(Integer [] array, Integer target){
        Map<Integer, Integer> map = new HashMap();
        Integer[] result = new Integer[2];
        for(int i = 0; i < array.length; i++){
            map.put(array[i], i);
        }
        for(int i = 0; i < array.length; i++){
            Integer d = target - array[i];
            if(map.containsKey(d)){
                result[0] = i;
                result[1] = map.get(d);
                break;
            }
        }
        return result;
    }
}
