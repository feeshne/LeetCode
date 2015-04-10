/**
 * Created by Feeshne on 2015/4/7.
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("111", ""));
    }

    public static String addBinary(String a, String b) {
        if (a == null || b == null) {
            return "";
        }
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        int aTmp, bTmp;
        while (aLength >= 0 || bLength >= 0 || index != 0) {
            aTmp = aLength >= 0 ? a.charAt(aLength) - '0' : 0;
            bTmp = bLength >= 0 ? b.charAt(bLength) - '0' : 0;
            int tmp = aTmp + bTmp + index;
            switch (tmp) {
                case 0:
                    sb.insert(0, 0);
                    break;
                case 1:
                    sb.insert(0, 1);
                    index = 0;
                    break;
                case 2:
                    sb.insert(0, 0);
                    index = 1;
                    break;
                case 3:
                    sb.insert(0, 1);
                    index = 1;
                    break;
            }
            aLength--;
            bLength--;
        }
        return sb.toString();
    }
}
