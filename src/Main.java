import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Feeshne on 2015/3/17.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//        HashMap<Integer,String> map=new HashMap<Integer,String>();

//        map.put(1,"1");
//        map.get(1);
//        System.out.println(1 == 1);
//        Integer i=1;
//        System.out.println(i.equals(1));
//        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add(0,1);
//        System.out.println(Math.round(11.3));
//        String a="a";
//        String b="b";
//        System.out.println(a+b);
//        Test a=new Test();
        int a=20;
        System.out.println(a>>>=2);

    }
    static class Contributor {
        String login;
        int contributions;
    }
    interface find{
        List<find> hello(String a,String b);
    }

    public static boolean isValid(TreeNode root,TreeNode left,TreeNode right){
        if(root==null){
            return true;
        }
        if(left!=null){
            if(left.val<=root.val){
                return isValid(left,left.left,left.right);
            }else{
                return false;
            }
        }else if(right!=null){
            if(right.val>root.val){
                return isValid(right,right.left,right.right);
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
