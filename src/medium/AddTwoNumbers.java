package medium;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        class Solution {
            public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                int val;
                ListNode next;
                ListNode baslangc = new ListNode();
                ListNode current = baslangc;
                int carr = 0;

                while (l1 != null || l2 != null || carr != 0) {
                    int sum = carr;

                    if (l1 != null) {
                        sum += l1.val;
                        l1 = l1.next;
                    }

                    if (l2 != null) {
                        sum += l2.val;
                        l2 = l2.next;
                    }

                    carr = sum / 10;
                    current.next = new ListNode(sum % 10);
                    current = current.next;
                }
                return baslangc.next;
            }
        }
    }
}

