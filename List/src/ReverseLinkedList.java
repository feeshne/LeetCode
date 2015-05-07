/**
 * Created by feeshne on 15-5-7.
 * 链表翻转
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode res = reverseList(a);
        while (res != null) {
            System.out.print(res.val + "-->");
            res = res.next;
        }
    }

    /*
    iteratively 遍历
     */
//    public static ListNode reverseList(ListNode head) {
//        ListNode pre=new ListNode(0);
//        ListNode cur=head;//遍历的指针
//        ListNode tmp;
//        while(cur!=null){
//            tmp=pre.next;
//            pre.next=cur;
//            cur=cur.next;
//            pre.next.next=tmp;
//        }
//        return pre.next;
//    }
    /*
    recursively 递归
     */
    public static ListNode reverseList(ListNode head) {
        return recursive(head, null);
    }

    public static ListNode recursive(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return recursive(next, head);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
