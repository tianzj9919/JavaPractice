class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode ans = new ListNode(0);
        ListNode cur = ans;

        while(list1 != null && list2 != null){
            if(list1.val>list2.val){
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }else{
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }
        }

        cur.next = (list1 == null) ? list2 : list1;
        
        return ans.next;
    }
}
