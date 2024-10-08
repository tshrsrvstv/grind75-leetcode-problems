package com.leet.code.week.one;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode first = list1.val < list2.val ? list1 : list2;
        ListNode second = list1.val < list2.val ? list2 : list1;
        ListNode temp;
        while(first.next!=null) {
            if(first.next.val<second.val) {
                first = first.next;
            } else if(first.next.val>second.val) {
                temp = second;
                second = first.next;
                first = temp;
            }
        }
        return first;
    }

    public static void printList(ListNode listNode) {
        ListNode current = listNode;
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        printList(list1);
        printList(list2);
        printList(mergeTwoLists(list1, list2));
    }
}
