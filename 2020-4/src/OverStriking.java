/**
 * 关键字加粗
 * Created by Qin on 2020/4/20.
 */
public class OverStriking {
    public static void main(String[] args) {
        String[] words = {"w", "E", "ba", "tn", "i"};
        String s = "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%E7%99%BE%E5%BA%A6&rsv_pq=9f0553ad002039fa&rsv_t=93e9iBa8mhoZbjNGwwaxN2J%2B1YZk1J7uU9uLbxlM3AMcvphzd3Gx14m0vmA&rqlang=cn&rsv_enter=1&rsv_dl=tb&rsv_sug3=1&rsv_sug1=1&rsv_sug7=100&rsv_sug2=0&inputT=3078&rsv_sug4=3078";
        OverStriking overStriking = new OverStriking();

        System.out.println(overStriking.boldWords(words, s));
    }

    public String boldWords(String[] words, String s) {
        StringBuilder sb = new StringBuilder();
        boolean[] isBold = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < words.length; j++) {
                int len = words[j].length();
                if (i + len - 1 < s.length() && words[j].equals(s.substring(i, i + len))) {
                    System.out.println(i + "是关键字");
                    for (int k = 0; k < len; k++) {
                        System.out.println(i + " " + k);
                        isBold[i + k] = true;
                    }
                }
            }
        }
        if (isBold[0] != true) {
        } else {
            sb.append("<b>");
        }
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (isBold[i] == true && isBold[i - 1] == false) {
                sb.append("<b>");
            }

            if (isBold[i] == false && isBold[i - 1] == true) {
                sb.append("</b>");
            }
            sb.append(s.charAt(i));

        }
        if (isBold[isBold.length - 1] == true) {
            sb.append("</b>");
        }

        return sb.toString();
    }
}

