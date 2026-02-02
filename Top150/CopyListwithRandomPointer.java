class Solution {
    public Node copyRandomList(Node head){
        if(head == null) return null;

        Node cur = head;
        while(cur != null){
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }

        cur = head;
        while(cur!=null){
            Node copy = cur.next;
            copy.random = (cur.random !=null) ? cur.random.next : null;
            cur = copy.next;
        }

        Node dummy = new Node(0);
        Node copyCur = dummy;
        cur = head;

        while(cur!=null){
            Node copy = cur.next;
            Node nextOld = copy.next;

            copyCur.next = copy;
            copyCur = copy;

            cur.next = nextOld;
            cur = nextOld;
        }

        return dummy.next;
    }
}
