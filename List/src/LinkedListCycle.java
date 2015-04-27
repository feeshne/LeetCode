/**
 * Created by Feeshne on 2015/4/27.
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//        f.next=b;
        System.out.println(hasCycle(a));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null&&fast.next!=null){
            //加不加try-catch语句对运行时间影响不大
            try{
                slow=slow.next;
                fast=fast.next.next;
            }catch (NullPointerException e){
                return false;
            }
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
