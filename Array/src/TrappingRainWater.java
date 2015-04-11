import java.util.Stack;


public class TrappingRainWater {
    public static void main(String[] args) {
        int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(A));
    }
    public static int trap(int[] A){
        if(A.length<3){
            return 0;
        }
        int res=0;//结果（困住的雨水)
        int pre=0;//前壁垒
        int post=A.length-1;//后壁垒
        while(pre<post&&A[pre]<=A[pre+1])pre++;
        while(pre<post&&A[post]<=A[post-1])post--;

        while(pre<post){
            int left=A[pre];
            int right=A[post];
            if(left<=right){
                while(pre<post&&left>=A[++pre]){
                    res+=left-A[pre];
                }
            }else{
                while(pre<post&&A[--post]<=right){
                    res+=right-A[post];
                }
            }
        }
        return res;
    }
}
