/**
 * Created by Feeshne on 2015/5/18.
 * 比较版本数
 */
public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1 = "1.0.0.0";
        String version2 = "1";
        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) {
            return 0;
        }
        String[] tmp1 = version1.split("\\.");
        String[] tmp2 = version2.split("\\.");
        int length1=tmp1.length;
        int length2=tmp2.length;
        for(int i=0,j=0;i<length1||j<length2;i++,j++){
            int a=(i<length1?Integer.valueOf(tmp1[i]):0);
            int b=(j<length2?Integer.valueOf(tmp2[j]):0);
            if(a<b){
                return -1;
            }else if(a>b){
                return 1;
            }
        }
        return 0;
    }
}