import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Feeshne on 15/4/25.
 */
public class ReorderList {
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
        reorderList(null);
        while (a != null) {
            System.out.print(a.val + "-->");
            a = a.next;
        }
    }

    public static void reorderList(ListNode head) {
        List<Integer> list=new ArrayList<Integer>();
        ListNode cur=head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        cur=head;
        int index=0;
        int i=0;
        int j=list.size()-1;
        while(cur!=null){
            if(index%2==0){
                cur.val=list.get(i);
                i++;
            }else{
                cur.val=list.get(j);
                j--;
            }
            index++;
            cur=cur.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
