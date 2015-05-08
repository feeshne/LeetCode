/**
 * Created by Feeshne on 2015/4/13.
 * 编码问题，注释都没有了，不想去找回来。
 * 应该是两个链表合在一个链表上
 */
public class IntersectionOfTwoLinkedLists {
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
        e.next = f;
        f.next = g;
//        g.next=d;
//        ListNode a=new ListNode(1);
        System.out.println(getIntersectionNode2(a, e));

    }

    public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = length(headA), lengthB = length(headB);
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }
        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }
        while (headA != null && headB != null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        if (headA != null) {
            return headA;
        } else {
            return null;
        }
    }

    public static int length(ListNode node) {
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while (a != b) {
            a = a.next;
            b = b.next;
            if (a == b) {
                return a;
            }
            if (a == null) a = headB;
            if (b == null) b = headA;
        }
        return a;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
