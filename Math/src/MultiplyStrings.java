/**
 * Created by Feeshne on 2015/4/14.
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("292","123"));
    }
    public static String multiply(String num1,String num2){
        if (null==num1||null==num2||num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        int length1 = num1.length();
        int length2 = num2.length();
        int[] result = new int[length1 + length2];
        for (int i = length1 - 1; i >= 0; i--) {
            int temp1 = num1.charAt(i) - '0';
            for (int j = length2 - 1; j >= 0; j--) {
                int temp2 = num2.charAt(j) - '0';
                int tempResult = temp1 * temp2;
                int decade = tempResult / 10;
                int unit = tempResult % 10;
                //对个位(最右位)操作(个位可能也要进)
                int index = i + j + 1;
                result[index] += unit;
                while (result[index] >= 10) {
                    result[index - 1] += result[index] / 10;
                    result[index] %= 10;
                    index--;
                }
                //对十位(最左位)操作(十位可能也要进)
                index = i + j;
                result[index] += decade;
                while (result[index] >= 10) {
                    result[index - 1] += result[index] / 10;
                    result[index] %= 10;
                    index--;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            res.append(result[i]);
        }
        return res.toString();
    }
}
