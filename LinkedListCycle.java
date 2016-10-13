/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 两个两个跳的话 要同时验证node2 != null && node2.next != null 因为数目有偶数奇数之分所以可能跳到null 或者倒数第一个
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2 != null && node2.next != null) {
            node2 = node2.next.next;
            node1 = node1.next;
            if(node1 == node2) {
                return true;
            }
            
        }
        return false;
    }
}