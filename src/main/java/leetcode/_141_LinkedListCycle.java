package leetcode;

public class _141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(5);
		ListNode n2 = new ListNode(4, n1);
		ListNode n3 = new ListNode(3, n2);
		ListNode n4 = new ListNode(2, n3);
		ListNode n5 = new ListNode(1, n4);

		System.out.println(hasCycle(n5));

	}

	public static boolean hasCycle(ListNode head) {
	    if(head==null || head.next==null )
				return false;
			ListNode slow=head,fast=slow.next;
			while( fast.next!=null && fast.next.next!=null)
			{
				if(slow==fast) return true;
				slow=slow.next;
				fast=fast.next.next;
			}
			return false;
	}
}