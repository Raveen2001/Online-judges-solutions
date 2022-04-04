/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int n = getListSize(head);
        
        int k2 = n - k + 1;
        
        ListNode temp1 = null;
        ListNode temp2 = null;
        
        ListNode cur = head;
        int curNodeNumber = 1;
        while(temp1 == null || temp2 == null){
            if(curNodeNumber == k){
                temp1 = cur;
            }
            if(curNodeNumber == k2){
                temp2 = cur;
            }
            cur = cur.next;
            curNodeNumber ++;
        }
        int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp;
        return head;
    }
    
    
    public int getListSize(ListNode head){
        ListNode cur = head;
        int size = 0;
        while(cur != null){
            size ++;
            cur = cur.next;
        }
        return size;
    }
}