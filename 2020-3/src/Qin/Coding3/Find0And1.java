package Qin.Coding3;


import java.util.HashSet;
import java.util.Set;

/**
 * 对称
 * Created by Qin on 2020/3/23.
 */
public class Find0And1 {
    public static void main(String[] args) {
        Find0And1 find0And1 = new Find0And1();
        int[] a = {0, 0, 0, 1, 1, 1, 0};
        System.out.println(find0And1.findMaxLength1(a));
    }

    public int findMaxLength1(int[] nums) {
               int A = 0;

        Set set4 = new HashSet();
        Set set1 = new HashSet();
        Set set2 = new HashSet();
        Set set3 = new HashSet();
        Set set5 = new HashSet();
        Set set6 = new HashSet();
        //找出连续重复字符的位置
        for (int l = 1; l < nums.length; l++) {
            if (nums.length < 4 && nums[l] == 0) {
                set1.add(nums[l]);
            } else {
                if (l >= 1 && l + 1 < nums.length && nums[l - 1] == nums[l + 1] && nums[l] == 0) {
                    set5.add(l - 1);
                    set5.add(l + 1);

                }
                if (nums[l - 1] == nums[l] && nums[l] == 0) {
                    set1.add(l - 1);
                    set1.add(l);
                }
            }

        }
        set2.add(set1.size());
        set1.clear();


        for (int l = 1; l < nums.length; l++) {
            if (nums.length < 4 && nums[l] == 1) {
                set3.add(nums[l]);

            } else {
                if (l >= 1 && l + 1 < nums.length && nums[l - 1] == nums[l + 1] && nums[l] == 1) {
                    set6.add(l - 1);
                    set6.add(l + 1);
                }

                if (nums[l - 1] == nums[l] && nums[l] == 1) {
                    set3.add(l - 1);
                    set3.add(l);
                }
            }
        }
        set4.add(set3.size());
        set3.clear();
        for (Object x : set4) {
            for (Object y : set2) {
                if (x == y) {
                    A = (int) x + (int) y;
                    A = Math.max(A, 2 * Math.min(set5.size(), set6.size()));
                }
            }
        }
        return A;
    }
}