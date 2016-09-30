/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//  加法的话 就是每一位和carry 相加
//  两个指针分别指向每一位 然后用carry纪录进位位
//  注意最后如果carry不是0 要把carry 放到最后 例子是：5+5 ＝ 10；
 
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int value = (l1.val+l2.val+carry)%10;
            carry = (l1.val+l2.val+carry)/10;
            head.next = new ListNode(value);
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int value = (l1.val + carry)%10;
            carry = (l1.val+carry)/10;
            head.next = new ListNode(value);
            head = head.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int value = (l2.val + carry)%10;
            carry = (l2.val + carry)/10;
            head.next = new ListNode(value);
            head = head.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            head.next = new ListNode(carry);
        }
        return dummy.next;
    }
} 