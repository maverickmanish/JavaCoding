package leetcode;

 
/*https://leetcode.com/problems/add-two-numbers/
	TC : O(max(m,n)) as it'll iterate till the longest list.
	SC : O(max(m,n)+1)*/
public class _2_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		   int carry=0;
			  ListNode head=new ListNode();
			ListNode p1=l1, p2=l2, p=head;
			  
			  while(p1!=null || p2!=null)
			  {
				  if(p1!=null)
				  {
					  carry+=p1.val;
					  p1=p1.next;
				  }
				  if(p2!=null)
				  {
					  carry+=p2.val;
					  p2=p2.next;
				  }
				  p.next = new ListNode(carry%10);
				  p=p.next;
				  carry/=10;
			  }
			  if(carry==1)
				  p.next=new ListNode(1);
				  return head.next;
	    }
	  
}


