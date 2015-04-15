import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Feeshne on 2015/4/15.
 */
public class TwoSum {
    public static void main(String[] args) {
//        int[] A={7,2,11,15};
        int[] A = {3, 2, 4};
        int[] tmp = twoSum(A, 7);
        for (int i : tmp) {
            System.out.print(i + ",");
        }
    }

    /*
    我这种是先存入再遍历，相对于其他比较耗时，主要原因估计是没想通，一开始map中没有值作比较，怎么比较呢？
    之后想了想，根据交换律，a+b=b+a，对吧，一开始map中没有值作对比，因为命中的那个值还没来，来了，你还在，就匹配上了，是吧。
    从接近300ms降到了250ms
    ps:map<下标为i的数组值,数组下标i>
     */
    public static int[] twoSum(int[] numbers, int target) {
        /*1,
//        int[] res = new int[2];
//        Map<Integer,Integer> tmp=new HashMap<Integer, Integer>();
//        for(int i=0;i<numbers.length;i++){
//            tmp.put(numbers[i],i);
//        }
//        for(int i=0;i<numbers.length;i++){
//            int index=target-numbers[i];
//            Integer index2=tmp.get(index);
//            if(index2!=null&&i!=index2){
//                res[0]=i+1;
//                res[1]=index2+1;
//                return res;
//            }
//        }
//        return res;
*/
        //2,
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int index = target - numbers[i];
            Integer index2 = map.get(index);//index2代表a+b中a的在数组中的下标
            if (index2 != null ) {
                result[0] = index2+1;
                result[1] = i+1;
                return result;
            }else {
                map.put(numbers[i], i);

            }
//            if (map.containsKey(target - numbers[i])) {
//                result[1] = i + 1;
//                result[0] = map.get(target - numbers[i]);
//                return result;
//            }
//            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
