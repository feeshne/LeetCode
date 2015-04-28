import java.util.List;

/**
 * Created by Feeshne on 2015/4/28.
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
        ListNode res=swapPairs(a);
        while (res != null) {
            System.out.print(res.val + "-->");
            res = res.next;
        }
    }


    public static ListNode swapPairs(ListNode head) {
        ListNode cur=head;//cur指针遍历链表
        ListNode pre=new ListNode(0);//pre指针表示哪个是链表的头结点
        pre.next=head;
        ListNode tmp=pre;//tmp指针为辅助作用，指向下一个要操作的指针
        while(cur!=null&&cur.next!=null){
            ListNode help=cur.next;//help指针表示要操作的两个指针（交换操作）中的第二个指针，cur表示第一个
            tmp.next=help;
            cur.next=help.next;
            help.next=cur;
            //
            tmp=cur;
            cur=cur.next;
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
