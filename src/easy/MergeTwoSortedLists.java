package easy;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class MergeTwoSortesLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null) {
            return list2;
        }
        return list1;
    }

    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        MergeTwoSortesLists solution = new MergeTwoSortesLists();

        ListNode merged = solution.mergeTwoLists(list1, list2);

        solution.printList(merged);
    }
}

