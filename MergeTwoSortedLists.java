/*
  Merge two sorted linked lists and return it as a new list. 
  The new list should be made by splicing together the nodes of the first two lists.
*/

public class MergeTwoSortedLists {

    public static class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {val = x;}
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	if (l1 == null) {return l2;}
	if (l2 == null) {return l1;}

	if (l1.next == null && l2.next == null) {
	    if (l1.val < l2.val) {
		l1.next = l2;
		return l1;
	    } else {
		l2.next = l1;
		return l2;
	    }
	}
	
	ListNode result = null;
	if (l1.val <= l2.val) {result = l1; l1 = l1.next;}
	else {result = l2; l2 = l2.next;}
	
	ListNode curr = result;
	while (l1 != null && l2 != null) {
	    if (l1.val <= l2.val) {curr.next = l1; l1 = l1.next;}
	    else {curr.next = l2; l2 = l2.next;}
	    curr = curr.next;
	}

	if (l1 == null) {curr.next = l2;}
	else curr.next = l1;
	
	return result;
    }

    public static void main (String args[]) {
	
    }
}