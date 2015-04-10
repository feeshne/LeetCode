import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Feeshne on 2015/4/1.
 */
public class LRUCache {

        class DLinkedNode {
            int key;
            int value;
            DLinkedNode pre;
            DLinkedNode post;
        }

        private Map<Integer, DLinkedNode>
                cache = new HashMap<Integer, DLinkedNode>();
        private int count;
        private int capacity;
        private DLinkedNode head, tail;

        private void addNode(DLinkedNode node) {
            //对于点
            node.pre = head;
            node.post = head.post;
            //对于head和之后的那个点
            head.post = node;
            node.post.pre = node;
        }

        private void removeNode(DLinkedNode node) {
            DLinkedNode pre = node.pre;
            DLinkedNode post = node.post;
            pre.post = post;
            post.pre = pre;
        }

        private void moveToHead(DLinkedNode node) {
            this.removeNode(node);
            this.addNode(node);
        }

        private DLinkedNode popTail() {
            DLinkedNode res = tail.pre;
            this.removeNode(res);
            return res;
        }

        public LRUCache(int capacity) {
            this.count = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            head.pre = null;
            tail = new DLinkedNode();
            tail.post = null;
            head.post = tail;
            tail.pre = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            this.moveToHead(node);
            return node.value;
        }

        public void set(int key, int value) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                DLinkedNode newNode = new DLinkedNode();
                newNode.key = key;
                newNode.value = value;
                this.cache.put(key, newNode);
                this.addNode(newNode);
                count++;
                if (count > capacity) {
                    DLinkedNode tail = this.popTail();
                    this.cache.remove(tail.key);
                    count--;
                }
            } else {
                node.value = value;
                this.moveToHead(node);
            }
        }

    public static void main(String[] args) {
        LRUCache lc=new LRUCache(1);
        lc.set(2,1);
        System.out.print(lc.get(2)+",");
        lc.set(3,2);
        System.out.print(lc.get(2)+",");
        System.out.print(lc.get(3)+",");
//        LRUCache lc=new LRUCache(2);
//        lc.set(2,1);
//        lc.set(1,1);
//        System.out.print(lc.get(2)+",");
//        lc.set(4,1);
//        System.out.print(lc.get(1)+",");
//        System.out.print(lc.get(2)+",");
//        LRUCache lc=new LRUCache(2);
//        System.out.print(lc.get(2)+",");
//        lc.set(2, 6);
//        System.out.print(lc.get(1) + ",");
//        lc.set(1, 5);
//        lc.set(1,2);
//        System.out.print(lc.get(1)+",");
//        System.out.print(lc.get(2)+",");
    }
}