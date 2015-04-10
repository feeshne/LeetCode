/**
 * Created by Feeshne on 2015/4/7.
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int nRows) {
        char[] sChars = s.toCharArray();
        StringBuilder[] res = new StringBuilder[nRows];
        for (int i = 0; i < res.length; i++) {
            res[i]=new StringBuilder();
        }
        int index = 0;
        int length = sChars.length;
        while (index < length) {
            //1.垂直添加
            for (int i = 0; i < nRows && index < length; i++) {
                res[i].append(sChars[index++]);
            }
            //2.斜向上添加
            for (int i = nRows - 2; i >= 1 && index < length; i--) {
                res[i].append(sChars[index++]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : res) {
            result.append(stringBuilder);
        }
        return result.toString();
    }
}
