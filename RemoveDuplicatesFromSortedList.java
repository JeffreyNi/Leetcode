/*
  Given a sorted linked list, delete all duplicates such that each element appear only once.

  For example,
  Given 1->1->2, return 1->2.
  Given 1->1->2->3->3, return 1->2->3.
*/

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
    }

    public static ListNode deleteDuplicates(ListNode head) {
	if (head == null) {return head;}
	
	int cur = head.val;
	ListNode prevNode = head;
	ListNode curNode = head.next;
	while (curNode != null) {
	    if (curNode.val == cur) {curNode = curNode.next;}
	    else {
		prevNode.next = curNode;
		prevNode = curNode;
		cur = curNode.val;
	    }
	}
	prevNode.next = curNode;
	
	return head;
    }

    public static void main(String args[]) {

    }

}