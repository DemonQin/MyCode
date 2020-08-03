package Qin.Coding3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Qin on 2020/3/21.
 */
public class LetterElimination {

    public static void main(String[] args) {
        String string ;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] strings = new String[T];
        int A, B, C = 0;
        for (int i = 0; i < T; i++) {
            string = scanner.next();
            strings[i] = string;
        }

/**
 * 注意：成批输入时，不能将输入循环和操作循环写在一个循环里，不然结果格式会很奇怪
 * 解决思路：将两个循环分开写，用一个容器作为桥梁
 */
        for (int i = 0; i < T; i++) {
            C = 0;

            string = strings[i];
            //输入字符串转StringBuilder
            StringBuilder sb = new StringBuilder(string);


            for (int j = 0; j < sb.length() + 1; j++) {

                //插入字符“A”,"B","C"
                for (int k = 0; k < 3; k++) {
                    switch (k) {
                        case 0:
                            sb.insert(j, "A");
                            break;
                        case 1:
                            sb.insert(j, "B");
                            break;
                        case 2:
                            sb.insert(j, "C");
                            break;

                    }

                    A = sb.length();
                    Set<Integer> set = new TreeSet(new MyComparator());

                    //重复消除连续重复字符
                    do {
                        set.clear();
                        char[] a = new char[sb.length() + 1];
                        sb.getChars(0, sb.length(), a, 0);

                        //找出连续重复字符的位置
                        for (int l = 1; l < a.length; l++) {
                            if (a[l - 1] == a[l]) {
                                set.add(l - 1);
                                set.add(l);
                            }
                        }

                        //根据索引删除所有重复字符
                        for (Integer x : set) {

                            /**
                             * 注意:每次删除，都会导致sb中字符位置改变
                             * 解决思路：从后往前删除
                             */
                            sb.deleteCharAt(x);
                        }

                        //满足条件就循环
                    } while (set.size() != 0);

                    B = sb.length();
                    C = Math.max(C, A - B);

                    //重新new StringBuilder对象
                    sb = new StringBuilder(string);
                }
            }
//            System.err.println(C);//为了校验数据方便，结果被坑了43分钟
            System.out.println(C);
        }
    }
}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //降序排列
        return o2.compareTo(o1);
    }
}