class Solution {
    public ListNode reverseKGroup(ListNode head, int k){
        if(head==null || k <=1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while(true){
            ListNode kth = getKth(groupPrev,k);
            if(kth == null) break;

            ListNode groupNext = kth.next;

            ListNode prev = groupNext;
            ListNode cur = groupPrev.next;
            while(cur!=groupNext){
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }

            ListNode newGroupHead = kth;
            ListNode newGroupTail = groupPrev.next;

            groupPrev.next = newGroupHead;
            groupPrev = newGroupTail;
        }

        return dummy.next;
    }

    private ListNode getKth(ListNode start, int k){
        while(start!=null && k>0){
            start = start.next;
            k--;
        }
        return start;
    }
}
