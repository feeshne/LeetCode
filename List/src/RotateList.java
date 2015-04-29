/**
 * Created by Feeshne on 2015/4/29.
 */
public class RotateList {
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
//        e.next = f;
        ListNode res = rotateRight(a, 10);
        while (res != null) {
            System.out.print(res.val + "-->");
            res = res.next;
        }
        System.out.println();
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;
        int length = getLength(head);
        ListNode cur = head;//cur指针表示之后确定的链表头
        ListNode tmp = null;//tmp指针表示之后确定的链表尾
        ListNode pre = new ListNode(0);//pre指向之后的链表头
        pre.next = head;
        //计算cur的位置，麻痹，理论上要从右边开始计算
        if (k > length) {
            k = k % length;
        }
        int index = length - k;
        while (index > 0) {
            tmp = cur;
            cur = cur.next;
            index--;
        }
        if (tmp != null && cur != null) {
            tmp.next = null;
            pre.next = cur;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = head;
        }
        return pre.next;
    }

    /**
     * 计算链表长度
     * @param head 链表头
     * @return 返回链表长度
     */
    public static int getLength(ListNode head) {
        int l = 0;
        while (head != null) {
            head = head.next;
            l++;
        }
        return l;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
