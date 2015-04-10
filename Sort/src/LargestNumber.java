import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Feeshne on 2015/3/25.
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] a={9,30,34,5,3};
//        int[] a;
        System.out.println(largestNumber(a));

    }
    public static String largestNumber(int[] num) {
        String[] numStrings=new String[num.length];
        for(int i=0;i<num.length;i++){
            numStrings[i]=String.valueOf(num[i]);
        }
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
//                return s1.compareTo(s2);
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(numStrings,comparator);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numStrings.length;i++){
            res.append(numStrings[i]);
        }
        return  res.toString();
    }
}
