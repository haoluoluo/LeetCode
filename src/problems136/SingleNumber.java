package problems136;

import java.util.HashMap;
import java.util.Map;

/**
  * @Package:        src
  * @ClassName:     SingleNumber
  * @Description:
  * @Author:         hll
  * @CreateDate:     12/2/18 6:41 PM
  * @UpdateUser:     hll
  * @UpdateDate:     12/2/18 6:41 PM
  * @UpdateRemark:   The modified content
  * @Version:        1.0
  * url: https://leetcode.com/problems/single-number/
  * <p>Copyright: Copyright (c) </p>
  **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            return entry.getKey();
        }
        return 0;
    }

    /**
     *bit  Manipulation
     */
    public int singleNumber2(int[] nums) {
        int re=0;
        for(int i=0;i<nums.length;i++){
            re ^= nums[i];
        }
        return re;
    }


}
