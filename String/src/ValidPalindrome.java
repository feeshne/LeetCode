/**
 * Created by Feeshne on 2015/4/7.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome("1a2"));
    }


    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder stringBuilder=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char tmpChar=s.charAt(i);
            if(tmpChar>96&&tmpChar<123||tmpChar>47&&tmpChar<58){
                stringBuilder.append(tmpChar);
            }
        }
        s=stringBuilder.toString();
        int pre = 0;
        int post = s.length() - 1;
        while (post >= 0) {
            if (s.charAt(pre) != s.charAt(post)) {
                return false;
            }
            pre++;
            post--;
        }
        return true;
    }
}
