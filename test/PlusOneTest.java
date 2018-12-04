import org.junit.Test;
import problems66.PlusOne;

import java.util.Arrays;

public class PlusOneTest {

    @Test
    public void plusOne() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }
}