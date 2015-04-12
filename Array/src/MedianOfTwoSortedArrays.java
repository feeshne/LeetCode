/**
 * Created by Feeshne on 15/4/12.
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
//        int[] A = {1, 2, 3};
//        int[] B = {4, 5, 6, 7};
//        System.out.println(findMedianSortedArrays(A, B));
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5,6,7}));
    }

    /**
     * 主要通过搜索A数组（为A、B两个数组中最长的），确定下标i的位置
     *
     * @param A 数组A
     * @param B 数组B
     * @return 中位数
     */
    public static double findMedianSortedArrays(int A[], int B[]) {
        double num1 = 0, num2 = 0;
        int m = A.length;
        int n = B.length;
        if (m > n) {
            return findMedianSortedArrays(B, A);
        }
        int iMin = 0;
        int iMax = m;
        int middle = (m + n + 1) >> 1;
        //遍历从iMin到iMax的A数组，确定下标i，
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = middle - i;
            if (j > 0 && i < m && B[j - 1] > A[i]) {
                iMin = i + 1;
            } else if (i > 0 && j < n && A[i - 1] > B[j]) {
                iMax = i - 1;
            } else {
                if (i == 0) {
                    num1 = B[j - 1];
                } else if (j == 0) {
                    num1 = A[i - 1];
                } else {
                    num1 = Math.max(A[i - 1], B[j - 1]);
                }
                //m+n数组长度为奇数
                if (((m + n) & 1) == 1) {
                    return num1;
                }
                if (i == m) {
                    num2 = B[j];
                } else if (j == n) {
                    num2 = A[i];
                } else {
                    num2 = Math.min(A[i], B[j]);
                }
                return (num1 + num2) / 2.0;
            }
        }
        return 0;
    }
}
