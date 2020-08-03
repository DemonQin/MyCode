import java.util.Arrays;
/**
 * Created by Qin on 2020/4/8.
 */
public class C {
    public static void main(String[] args) {
        C c = new C();
        int[] nums = {2, 1, 0, 2, 1};
        c.SortColor(nums);
    }

    public void SortColor(int[] nums) {
        int[] nums2 = new int[nums.length];
        int k = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                nums2[k] = nums[i];
                k++;
            }
            if (nums[i] == 2) {
                nums2[nums.length - 1 - l] = nums[i];
                l++;
            }
        }
        //调用数组tostring方法
        System.out.println(Arrays.toString(nums2));
    }
}
