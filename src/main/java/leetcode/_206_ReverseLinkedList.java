package leetcode;

public class _206_ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(4,n1);
		ListNode n3=new ListNode(3,n2);
		ListNode n4=new ListNode(2,n3);
		ListNode n5=new ListNode(1,n4);
		
		System.out.println(reverseList(n5));
		
	}
	  public static ListNode reverseList(ListNode head) {
	        if(head==null || head.next==null)
	        	return head;
	        ListNode current=head, prev=null,ahead=current.next;
	        while(ahead!=null)
	        {
	        	current.next=prev;
	        	prev=current;
	        	current=ahead;
	        	ahead=ahead.next;
	        }
	        current.next=prev;
	        return current;
	    }
	}