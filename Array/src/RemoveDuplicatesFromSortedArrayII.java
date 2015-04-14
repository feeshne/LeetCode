/**
 * Created by Feeshne on 2015/4/14.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] A = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(A));
        for (int i : A) {
            System.out.print(i + ",");
        }
    }

    public static int removeDuplicates(int[] A) {
        int length = A.length;
        if (length == 0) return 0;
        int i = 1, j = 0;
        final int TIMES = 2;
        int index = 1;//
        while (i < length) {
            if (A[i] != A[j]) {
                index = 1;
                A[++j] = A[i++];
            } else {
                if (index < TIMES) {
                    index++;
                    A[++j] = A[i++];
                } else {
                    i++;
                }
            }
        }
        return j + 1;
    }
}
