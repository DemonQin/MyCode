//package Qin.Coding3_12;
//未完成
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
///**
// * Created by Qin on 2020/3/14.
// */
//public class Main {
//    /**
//     * Created by Qin on 2020/3/14.
//     * <p>
//     * 现在有n个长度为m的字符串，编号为从1到n，每个字符串由m个大写字母组成。
//     * 现在你可以完成以下操作，请你任选第 i 个字符串和第 j 个字符串，并交换长度为 k 的前缀。
//     * 你可以在变换后的基础上进行任意次这样的操作。
//     * <p>
//     * 例如：ABCD 和 EFGH，令k=2则变为 EFCD 和 ABGH。
//     * <p>
//     * 此时对于新的字符串 EFCD 和 ABGH 令k=1则变为 AFCD 和 EBGH。
//     * <p>
//     * 显然变化后的字符串是不同的。
//     * <p>
//     * 现在请问你可以生成多少个不同的字符串。包含原串本身。
//     */
//
//        /**
//         * 输入第一行包含两个正整数n，m，(1<=n,m<=100)表示n个长度为m的字符串。
//         * <p>
//         * 接下来n行，每行有一个长度为m的字符串，仅包含大写字母。
//         */
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int k = sc.nextInt();
//            String[] str=new String[n];
//            Set<StringBuilder> set = new HashSet();
//            StringBuilder[] a = new StringBuilder[n];
//            StringBuilder e = new StringBuilder();
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    char c = (char) (65 + (int) (Math.random() * 26));
//                    e.append(c);
//                }
//                a[i] = e;
//                e = new StringBuilder();
//            }
//            for (StringBuilder x : a) {
//                System.out.println(x);
//                set.add(x);
//                x.replace(0,k,(String)str[0]);
//                x.getChars(0,k,str,0);
//            }
//
//            System.out.println(set.size() % 1000000007);
//        }
///**
// * 输出仅包含一个正整数，表示不同的字符串数量，由于数量可能很大，所以请输出答案对1000000007取模的结果。
// */
//
//
//
//}
