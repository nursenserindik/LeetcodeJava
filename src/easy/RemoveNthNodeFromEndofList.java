package easy;

public class RemoveNthNodeFromEndofList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { this.val = v; }
        ListNode(int v, ListNode n) { this.val = v; this.next = n; }
    }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null || head == null)
            return null;
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        temp = head;
        int point = length - n;
        if (point == 0)
            return head.next;
        int i = 0;
        for(temp = head ; temp != null; temp=temp.next) {
            if(i==(point-1)) {
                temp.next = temp.next.next;
                break;
            }
            i++;
        }
        return head;
    }
}

