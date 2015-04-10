/**
 * Created by Feeshne on 2015/4/8.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs=new String[]{"aaaa","aab"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res=new StringBuilder();
        int length=0;
        try{
            while(true){
                char now=strs[0].charAt(length);
                for(int j=0;j<strs.length;j++){
                    if(strs[j].charAt(length)!=now){
                        return res.toString();
                    }
                }
                length++;
                res.append(now);
            }
        }catch(Exception e){
            return res.toString();
        }
    }
}
