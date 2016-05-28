package utils;

import main.ListNode;

public class ListHelpers {
    public static void addNode(ListNode list, Integer n) {
        ListNode first = list;
        while (first.next != null) {
            first = first.next;
        }
        if (n != null)
            first.next = new ListNode(n);
        else
            first.next = null;
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

    public static ListNode getListFromString(String listString) {
        String[] split = listString.split("->");
        ListNode list = new ListNode(Integer.parseInt(split[0]));
        for (int i = 1; i < split.length; i++) {
            if (!split[i].equals("NULL"))
                addNode(list, Integer.parseInt(split[i]));
            else addNode(list, null);
        }
        return list;
    }
}
