import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Locale;

/**
 * Created by Feeshne on 2015/4/9.
 */
public class CountAndSay {
    public static void main(String[] args) {
//        System.out.println(countAndSay(21));
//        System.out.println(countAndSay(111221));
        long cur=System.currentTimeMillis();
        System.out.println(countAndSay(60));
        System.out.println(System.currentTimeMillis()-cur);

    }

    public static String countAndSay(int n) {
        String res="0";
        for (int i = 0; i < n; i++) {
            res=countOnce(res);
        }
        return res;
    }


    public static String countOnce(String tmp) {
        if(tmp.equals("0")){
            return "1";
        }
        int length = 0;
        StringBuilder res = new StringBuilder();
        while (length < tmp.length()) {
            char i = tmp.charAt(length);
            int index = 1;
            length++;
            while (length < tmp.length() && i == tmp.charAt(length)) {
                length++;
                index++;
            }
            res.append(index).append(i);
        }
        return res.toString();
    }

}
