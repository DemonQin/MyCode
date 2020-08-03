import java.util.Arrays;

/**
 * 重新格式化字符串
 * Created by Qin on 2020/4/20.
 */
public class ReFormat {
    public static void main(String[] args) {
        ReFormat reFormat = new ReFormat();
        String s = "co019";
        System.out.println(reFormat.reformat(s));

    }

    public String reformat(String s) {

        //创建字符数组(一个副本)
        char[] chars = new char[s.length()];
        char[] chars2 = new char[s.length()];
        s.getChars(0, s.length(), chars, 0);
        s.getChars(0, s.length(), chars2, 0);

        //计数器
        int j = 0;//字母
        int k = 0;//数字

        //对对字符数组内部进行排序
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] > 96) {
                chars2[s.length() - j-1] = chars[i];
                j++;
            } else {
                chars2[k] = chars[i];
                k++;
            }
        }

        //特殊情况，直接返回""
        if (k == 0 || k == s.length()) {

            //比较坑,单个字符返回字符本身
            if (s.length() == 1) {
                return s;
            }

            return "";
        }
        System.out.println(Arrays.toString(chars2));
        System.out.println(k);
        System.out.println(j - 1);

        /**
         * 对字符进行插入chars操作
         * 根据计数器的大小判断字符的位置
         * 大的在偶数位
         */
        if (j  < k) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    chars[i] = chars2[i / 2];
                } else {
                    chars[i] = chars2[s.length() - 1 - i / 2];
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    chars[i] = chars2[s.length() - 1 - i / 2];
                } else {
                    chars[i] = chars2[i / 2];

                }
            }
        }
        System.out.println(Arrays.toString(chars));

        //输出格式
        StringBuilder sb = new StringBuilder();
        for (char x : chars) {
            sb.append(x);
        }
        return new String(sb);
    }
}
