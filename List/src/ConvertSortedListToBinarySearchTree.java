/**
 * Created by feeshne on 15-5-14.
 * 已排序（从小到大）链表转二叉搜索树
 * ps：这个rt了。。。
 */
public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next=e;
        e.next = f;
        f.next = g;
        TreeNode res=sortedListToBST(a);
        System.out.println(res.val);
    }
    public static TreeNode sortedListToBST(ListNode head) {
        int length=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            length++;
        }
        return cal(head,0,length-1);
    }
    public static TreeNode cal(ListNode tmp,int pre,int last){
        if(pre>last) {
            return null;
        }
//        int mid=pre+(last-pre)/2;
        int mid=(pre+last)/2;
        ListNode tmp0=tmp;
        for (int i=pre;i<mid;i++){
            tmp0=tmp0.next;
        }
        TreeNode left=cal(tmp,pre,mid-1);
        TreeNode right=cal(tmp0.next,mid+1,last);
        TreeNode res=new TreeNode(tmp0.val);
        res.left=left;
        res.right=right;
        return res;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
