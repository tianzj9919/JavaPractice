class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode sum = new ListNode(0);
        ListNode cur = sum;
        int carry = 0;

        while(l1 != null || l2!=null || carry!=0){
            int x = (l1!=null)? l1.val : 0;
            int y = (l2!=null)? l2.val : 0;

            int s = x + y + carry;
            carry = s/10;

            cur.next = new ListNode(s%10);
            cur = cur.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return sum.next;
    }
}
