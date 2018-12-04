package problems53;

/**
 * @Package:        problems53
 * @ClassName:
 * @Description:    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * @Author:         hll
 * @CreateDate:     12/3/18 9:06 PM
 * @UpdateUser:     hll
 * @UpdateDate:     12/3/18 9:06 PM
 * @UpdateRemark:   The modified content
 * @Version:        1.0
 * <p>Copyright:    Copyright (c) </p>
 **/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) throws Exception {
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for(int i =0; i< nums.length; i++){
            if(max_ending_here < 0) max_ending_here = 0;
            max_ending_here += nums[i];
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
