import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by feeshne on 15-5-4.
 */
public class ReverseLinkedListII {
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
        ListNode res=reverseBetween(a,2,4);
        while (res != null) {
            System.out.print(res.val + "-->");
            res= res.next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode cur=head;
        Map<Integer,ListNode> map=new HashMap<Integer,ListNode>();
        List<Integer> list=new ArrayList<Integer>();
        m--;
        n=n-m;
        while(cur!=null&&m>0){
            cur=cur.next;
            m--;
        }
        int index=0;
        while(cur!=null&&n>0){
            map.put(index++,cur);
            list.add(cur.val);
            cur=cur.next;
            n--;
        }
        int length=map.size()-1;
        for(int i=0;i<index;i++){
            map.get(i).val=list.get(length--);
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
