/**
 * Created by Feeshne on 2015/4/16.
 */
public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(2, 6));
    }

    public static double pow(double x, int n) {
//        if(n==0)
//            return 1.0;
//        if(n<0)
//            return 1.0/pow(x,-n);
//        double half = pow(x,n>>1);
//        if(n%2==0)
//            return half*half;
//        else
//            return half*half*x;

        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            return 1.0 / pow(x, -n);
        }
        double result = 1;
        for (double f = x; n > 0; n = n >> 1) {
            if (n % 2 == 1) {
                result *= f;
            }
            f = f * f;
        }
//        if (n % 2 == 0) {
//            return tmp * tmp;
//        } else {
//            return tmp * tmp * x;
//        }
        return result;
    }
}
