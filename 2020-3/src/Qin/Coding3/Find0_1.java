package Qin.Coding3;

/**
 * Created by Qin on 2020/3/23.
 */
public class Find0_1 {
    public static void main(String[] args) {
        Find0_1 find0_1 = new Find0_1();
        int[] a = {0, 0, 1, 0, 0, 0, 1, 1};

        System.out.println(find0_1.findMaxLength(a));
    }

    /**
     * 解题思想：用窗口的模式去检查数组，当窗口内0和1的数量相等时记录
     * 优化思想：窗口逐渐缩小，当当窗口内0和1的数量相等时，记录并停止
     *
     * @param nums
     * @return
     */
    public int findMaxLength(int[] nums) {
        int A, B,D,E;
        int C = 0;
        int k = nums.length;

        //确定窗口缩小
        for (int l = 0; l < nums.length; l++) {

            k = k - 1;
            //窗口移动
            for (int i = 0; i <= nums.length; i++) {

                //窗口
                int[] b = new int[nums.length - i];

                //数据加载到窗口
                for (int j = 0; j < k - i; j++) {
                    b[j] = nums[i + j];
                }

                A = 0;
                B = 0;

                //计算窗口内数量
                for (Integer x : b) {
                    if (x == 0) {
                        A++;
                    } else {
                        B++;
                    }



                }if (A == B) {
                    C = Math.max(C, 2 * B);
                }

            }


        }

        return C;
    }
}
