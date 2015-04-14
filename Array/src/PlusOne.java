/**
 * Created by Feeshne on 2015/4/14.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        int[] tmp = plusOne(digits);
        for (int i : tmp) {
            System.out.print(i + ",");
        }
    }


    public static int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
//            int tmp = (digits[i] + res[i + 1]);
            int tmp=digits[i];
            int length = i + 1;
            res[length] += tmp;
            while (res[length] >= 10) {
                res[length - 1] += res[length] / 10;
                res[length] %= 10;
                length--;
            }
        }
        if(res[0]==0){
            for(int i=0;i<digits.length;i++){
                digits[i]=res[i+1];
            }
            return digits;
        }else{
            return res;
        }
//        digits[digits.length - 1] += 1;
//        int carry=0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if(digits[i]==10){
//                carry=1;
//                digits[i]%=10;
//            }else {
//                digits[i]+=carry;
//                carry=0;
//            }
//
//        }
//        return digits;
    }
}
