package problems66;

/**
 * @Package:
 * @ClassName:
 * @Description:
 * url: https://leetcode.com/problems/plus-one/
 * @Author:         hll
 * @CreateDate:     12/2/18 9:35 PM
 * @UpdateUser:     hll
 * @UpdateDate:     12/2/18 9:35 PM
 * @UpdateRemark:   The modified content
 * @Version:        1.0
 * <p>Copyright: Copyright (c) </p>
 **/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i] += 1;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        int [] nums = new int[digits.length+1];
        nums[0]=1;
        return nums;
    }
}
