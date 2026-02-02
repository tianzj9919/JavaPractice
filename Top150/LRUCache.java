import java.util.*;

class LRUCache {
    private static class Node{
        int key, val;
        Node prev, next;
        Node(int k, int v){
            key = k;
            val = v;
        }
    }

    private final int capacity;
    private final Map<Integer,Node> map;

    private final Node head;
    private final Node tail;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        Node node = map.get(key);
        if(node == null) return -1;
        moveToFront(node);
        return node.val;
    }
    
    public void put(int key, int value){
        Node node = map.get(key);

        if(node != null){
            node.val = value;
            moveToFront(node);
            return;
        }

        Node newNode = new Node(key, value);
        map.put(key,newNode);
        addToFront(newNode);

        if(map.size()> capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }

    private void addToFront(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToFront(Node node){
        remove(node);
        addToFront(node);
    }
}
