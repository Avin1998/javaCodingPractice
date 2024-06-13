package com.company.linkedLists;

import java.util.List;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public static ListNode createList(int[] arr) {
            if(arr.length == 0) return new ListNode();
            ListNode head = new ListNode(arr[0]);
            ListNode curr = head;
            for(int i = 1; i < arr.length; i++) {
                  curr.next = new ListNode(arr[i]);
                  curr = curr.next;
            }
            return head;
      }

      public static void printList(ListNode head) {
            while(head != null) {
                  System.out.print(head.val);
                  if(head.next != null) System.out.print(" -> ");
                  head = head.next;
            }
      }

}
