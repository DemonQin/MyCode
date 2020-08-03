/**
 *
 * Created by Qin on 2020/4/21.
 */
public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
       int len= nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 1) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }

        return k;
    }
}
