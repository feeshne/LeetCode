/**
 * Created by feeshne on 15-5-8.
 * 链表的插入排序
 */
public class InsertionSortList {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(8);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode res = insertionSortList(a);
        while (res != null) {
            System.out.print(res.val + "-->");
            res = res.next;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode pre = new ListNode(0);
        ListNode cur = head;//遍历旧链表
        while (cur != null) {
            ListNode tmp = pre.next;//遍历新链表
            ListNode tmp2 = pre;//遍历新链表，表示前一个节点
            while (tmp != null) {
                if (cur.val < tmp.val) {
                    tmp2.next = cur;
                    cur = cur.next;
                    tmp2.next.next = tmp;
                    break;
                }
                tmp2 = tmp;
                tmp = tmp.next;
            }
            if (tmp == null) {
                tmp2.next = cur;
                cur = cur.next;
                tmp2.next.next = null;
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
