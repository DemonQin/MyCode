/**
 *
 * Created by Qin on 2020/4/21.
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Merge merge = new Merge();
        merge.merge(nums1, m, nums2, n);
    }

    public void merge(int[] A, int m, int[] B, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;

        System.out.println(A[len]);

        while (len1>=0&&len2>=0) {
           A[len--]=A[len1]>B[len2]?A[len1--]:B[len2--];
        }
        System.arraycopy(B, 0,A, 0, len2 + 1);
    }
}


