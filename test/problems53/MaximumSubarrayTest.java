package problems53;

import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
//        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int [] nums = {-1};
        try {
            System.out.println(maximumSubarray.maxSubArray(nums));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}