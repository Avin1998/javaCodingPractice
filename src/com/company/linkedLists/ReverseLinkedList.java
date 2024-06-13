package com.company.linkedLists;

import static com.company.linkedLists.ListNode.createList;
import static com.company.linkedLists.ListNode.printList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] listArray = new int[]{1,2,3,4,5};
        ListNode head = createList(listArray);
        ListNode curr = head.next;
        head.next = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = head;
            head = curr;
            curr = temp;
        }
        printList(head);
    }
}
