import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * Created by Qin on 2020/4/6.
 */
public class A {
    public static void main(String[] args) {
        A a = new A();
      //  a.intersection();
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] nums3 = new int[set.size()];
        int k = 0;
        for (int x : set) {
            nums3[k] = x;
            k++;
        }
        return nums3;
    }
}
