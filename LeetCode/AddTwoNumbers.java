package LeetCode;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode cur = res;
        while(l1 != null && l2 != null){
            int a = l1.val;
            int b = l2.val;
            l1 = l1.next;
            l2 = l2.next;
            int sum = a + b + carry;
            int onePlace = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(onePlace);
            cur = cur.next;
        }
        
        while(l1 != null){
            int sum = l1.val + carry;
            int onePlace = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(onePlace);
            cur = cur.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            int sum = l2.val + carry;
            int onePlace = sum % 10;
            carry = sum / 10;
            cur.next = new ListNode(onePlace);
            cur = cur.next;
            l2 = l2.next;
        }
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return res.next;
    }
}



// method 2 -- optimal


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
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null && carry == 0) return null;
        
        int a = l1 != null ? l1.val : 0;
        int b = l2 != null ? l2.val : 0;
        
        int sum = a + b + carry;
        carry = sum / 10;
        
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        
        return new ListNode(sum%10, addTwoNumbers(l1, l2));
    }
}
