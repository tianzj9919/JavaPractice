class Solution {
    public ListNode deleteDuplicates(ListNode head){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        while(cur!=null){
            if(cur.next!=null && cur.next.val==cur.val){
                while(cur.next!=null && cur.next.val==cur.val){
                    cur=cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
