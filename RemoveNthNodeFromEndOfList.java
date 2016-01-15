// double pointers 

/*
  Given a linked list, remove the nth node from the end of list and return its head.

  For example,
  Given linked list: 1->2->3->4->5, and n = 2.

  After removing the second node from the end, the linked list becomes 1->2->3->5.

  Note:
  Given n will always be valid.
  Try to do this in one pass.
*/

public class RemoveNthNodeFromEndOfList {

    public static class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
	ListNode first = head;
	ListNode second = head;
	ListNode result = head;

	while (n-- > 0 && first != null) { first = first.next; }

	if (first == null) { return result.next; }

	while (first.next != null) {
	    first = first.next;
	    second = second.next; 
	}

	second.next = (second.next).next;
	return head;

    }

    public static void printList(ListNode head) {
	ListNode list = head;
	while (list != null) {
	    System.out.println(list.val);
	    list = list.next;
	}
    }

    public static void main(String args[]) {
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);

	printList(head);
	
	printList(removeNthFromEnd(head, 3));
	

    }
}