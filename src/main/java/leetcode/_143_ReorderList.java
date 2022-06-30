package leetcode;

public class _143_ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(4, n1);
		ListNode n3 = new ListNode(3, n2);
		ListNode n4 = new ListNode(2, n3);
		ListNode n5 = new ListNode(1, n4);

		System.out.println(n5);
		reorderList(n5);
		System.out.println(n5);

	}

	public static void reorderList(ListNode head) {
		if (head.next == null || head.next.next == null)
			return;
		ListNode slow = head, fast = slow.next;
		while (fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode firstNode = reverseList(slow.next);
		slow.next = firstNode;
		fast = firstNode;
		ListNode x = head;

		while (x != slow ) {
			ListNode fastAhead = fast.next, xAhead = x.next;
			x.next = fast;
			fast.next = xAhead;
			x = xAhead;
			fast = fastAhead;
		}
		if(fast!=null)
			x.next=fast;
		else
			x.next=null;

	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode current = head, prev = null, ahead = current.next;
		while (ahead != null) {
			current.next = prev;
			prev = current;
			current = ahead;
			ahead = ahead.next;
		}
		current.next = prev;
		return current;
	}
}