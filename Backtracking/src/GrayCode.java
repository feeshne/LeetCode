import java.util.ArrayList;
import java.util.List;

/**
 * Created by Feeshne on 2015/4/15.
 */
public class GrayCode {
    public static void main(String[] args) {
        List<Integer> tmp = grayCode(2);
        for (int i = 0; i < tmp.size(); i++) {
            System.out.println(tmp.get(i));
        }
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            int index = 1 << i;
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) + index);
            }
        }
        return res;
    }
}
