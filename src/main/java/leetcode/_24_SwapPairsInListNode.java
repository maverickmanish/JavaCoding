package leetcode;

public class _24_SwapPairsInListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(4,n1);
		ListNode n3=new ListNode(3,n2);
		ListNode n4=new ListNode(2,n3);
		ListNode n5=new ListNode(1,n4);
		
		System.out.println(swapPairs(n5));
	}
	
	public static ListNode swapPairs(ListNode head) {
		 ListNode dummy = new ListNode(0);
		 dummy.next = head;
		 ListNode p = head;
		 ListNode prev = dummy;
		 while (p != null && p.next != null) {
		 ListNode q = p.next, r = p.next.next;
		 prev.next = q;
		 q.next = p;
		 p.next = r;
		 prev = p;
		 p = r;
		 }
		 return dummy.next;
		}


}
