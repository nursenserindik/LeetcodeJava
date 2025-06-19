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
                int val;     // Düğümdeki veri
                ListNode next;  // Sonraki düğümü işaret et
                ListNode baslangc = new ListNode();
                ListNode current = baslangc;
                int carr = 0;

                //current yeni liste takibi
                //carr elde

                while (l1 != null || l2 != null || carr != 0) { //  + eldenin bos olup olmadıgına bakmak

                    int sum = carr;


                    if (l1 != null) { //bos degilse
                        sum += l1.val; //toplama ekle
                        l1 = l1.next; //sıradaki basamak

                    }

                    if (l2 != null) {
                        sum += l2.val;
                        l2 = l2.next;
                    }

                    carr = sum / 10; //crr kontrol
                    current.next = new ListNode(sum % 10);
                    current = current.next;
                }
                return baslangc.next;

            }
        }
    }
}

