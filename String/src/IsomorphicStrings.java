import java.util.HashMap;
import java.util.Map;

/**
 * Created by feeshne on 15-4-30.
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(null==s||null==t){
            return false;
        }
        String tmp1=cal(s);
        String tmp2=cal(t);
        if(tmp1.equals(tmp2)){
            return true;
        }
        return false;
    }
    public static String cal(String s){
        Map<Character,Character> res=new HashMap<Character,Character>();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char c2=res.getOrDefault(c,'0');
            if(c2!='0'){
                stringBuilder.append(c2);
            }else {
                res.put(c, (char) ('a'+i));
                stringBuilder.append(res.get(c));
            }
        }
        return stringBuilder.toString();
    }
}
