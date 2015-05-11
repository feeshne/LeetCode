/**
 * Created by feeshne on 15-5-11.
 * 划分链表，划分后大致的相对关系不变
 */
public class PartitionList {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(2);
        a.next = b;
        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
        ListNode res = partition(a, 3);
        while (res != null) {
            System.out.print(res.val + "-->");
            res = res.next;
        }
    }

    public static ListNode partition(ListNode head, int x) {
//        ListNode node1(0), node2(0);
//        ListNode *p1 = &node1, *p2 = &node2;
//        while (head) {
//            if (head->val < x)
//                p1 = p1->next = head;
//            else
//                p2 = p2->next = head;
//            head = head->next;
//        }
//        p2->next = NULL;
//        p1->next = node2.next;
//        return node1.next;
        ///////////////////////
//        struct ListNode left,right;
//        struct ListNode *left_cursor,*right_cursor;
//
//        left_cursor = &left;
//        right_cursor = &right;
//
//        while(head){
//            if(head->val < x){
//                left_cursor->next = head;
//                left_cursor = left_cursor->next;
//            }else{
//                right_cursor->next = head;
//                right_cursor = right_cursor->next;
//            }
//            head = head->next;
//        }
//
//        right_cursor->next = NULL;
//        left_cursor->next = right.next;
        ListNode tmp = new ListNode(0), tmp0 = new ListNode(0);//新建两个节点，tmp指向小数最开始的节点，tmp0指向大数最开始的节点
        ListNode p=tmp,p0=tmp0;//为上两个节点的辅助节点
        while (head != null) {//遍历链表
            if (head.val < x) {//如果小于指定值
                /*
                p.next=head;
                p=p.next
                p指针保存小于x的节点
                 */
                p=p.next=head;
            } else {
                /*
                原理同上
                p0指针保存大于等于x的节点
                 */
                p0=p0.next=head;
            }
            head = head.next;
        }
        /*到此，p为小数最后的那个节点，
        p0为大数最后的那个节点
        */
        p0.next = null;//p0为保存大数的指针，所以最后一个节点指向null
        p.next = tmp0.next;//tmp0指向大数，则小数最后的节点p指向大数最开始的节点
        return tmp.next;//返回小数最开始的节点
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
