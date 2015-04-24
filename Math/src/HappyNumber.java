/**
 * Created by Feeshne on 2015/4/24.
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(7));
    }
    public static boolean isHappy(int n) {
        int[] tmp=new int[]{0,1,4,9,16,25,36,49,64,81};
        if (n < 10) {
            n*=n;
        }
        while(n>=10){
            String s=Integer.toString(n);
            int[] res=new int[s.length()];
            n=0;
            for(int i=0;i<s.length();i++){
                res[i]=s.charAt(i)-'0';
            }
            for(int i:res){
                n+=tmp[i];
            }
        }
        if(n==1)return true;
        return false;
    }
}
