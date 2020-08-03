package Qin.Coding3;

import java.util.Scanner;

/**整数A+B的和
 * 求两个
 * Created by Qin on 2020/3/21.
 */
public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //注意点：用hasNext()判断是否有下一个输入
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);

        }
    }
}
