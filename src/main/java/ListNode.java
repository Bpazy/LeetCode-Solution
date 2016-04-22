public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void addNode(ListNode list, int n) {
        ListNode first = list;
        while (first.next != null) {
            first = first.next;
        }
        first.next = new ListNode(n);
    }

    public static void printList(ListNode list, String str) {
        ListNode node = list;
        System.out.print(str + ": ");
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode insertNode(ListNode list, int offset, int value) {
        ListNode temp = list;
        if (offset == 0) {
            ListNode node = new ListNode(value);
            node.next = list;
            list = node;
            return list;
        }
        for (int i = 1; i < offset; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(value);
        node.next = temp.next;
        temp.next = node;
        return list;
    }
}