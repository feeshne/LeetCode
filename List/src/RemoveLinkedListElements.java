/**
 * Created by Feeshne on 2015/4/24.
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=f;
        ListNode res=removeElements(a,1);
        while(res!=null){
            System.out.print(res.val+"-->");
            res=res.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);//标记head
        ListNode tmp=pre;//辅助链点
        ListNode cur=head;//遍历每个元素
        pre.next = head;
        while(cur!=null){
            while(cur!=null&&cur.val==val){
                cur=cur.next;
            }
            tmp.next=cur;
            tmp=cur;
            if(cur!=null){
                cur=cur.next;
            }
        }
        return pre.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
