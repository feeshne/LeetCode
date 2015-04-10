/**
 * Created by Feeshne on 2015/4/2.
 */
public class Numberof1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.MAX_VALUE+1));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }

    public static int hammingWeight(int n){
        String tmp;
        if(n>=0){
            tmp=Integer.toBinaryString(n);
        }else {
            tmp=Integer.toBinaryString(n)+"0";
        }
        char[] chars=tmp.toCharArray();
        int index=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='1'){
                index++;
            }
        }
        return index;
    }

}
