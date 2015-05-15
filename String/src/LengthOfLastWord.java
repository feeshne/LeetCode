/**
 * Created by feeshne on 15-5-15.
 * 字符串最后一个单词的长度
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="Hello World";
//        String s = "a";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        //耗时太久了
//        String[] tmp=s.split(" ");
//        if(tmp.length>0){
//            return tmp[tmp.length-1].length();
//        }
//        return 0;
        //
        //part 2
        int length = 0;
        s=s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                length++;
            } else break;
        }
        return length;
    }
}
