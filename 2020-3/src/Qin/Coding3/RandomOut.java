package Qin.Coding3;

import java.util.ArrayList;

/**
 * 数组随机输出
 * Created by Qin on 2020/3/12.
 */
public class RandomOut {


    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 8, 9, 7};
        ArrayList<Integer> c = new ArrayList();
        while (1 == 1) {
            int b = (int) (Math.random() * a.length);
            if (!c.contains(b)) {
                c.add(b);
            }
            if (c.size() == a.length) {
                break;
            }
        }
        for (int x : c) {
            System.out.print("\t" + a[x]);
        }


    }

}
