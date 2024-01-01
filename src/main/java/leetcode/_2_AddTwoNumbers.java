package leetcode;


import java.util.Objects;

/*https://leetcode.com/problems/add-two-numbers/
	TC : O(max(m,n)) as it'll iterate till the longest list.
	SC : O(max(m,n)+1)*/
public class _2_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode addNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode();
		ListNode p = head;
		int carry = 0;
		while (Objects.nonNull(l1) || Objects.nonNull(l2)) {
			if(l1 !=null) {
				carry += l1.val;
				l1 =l1.next;
			}
			if(l2 !=null) {
				carry += l2.val;
				l2 = l2.next;
			}
			p.next = new ListNode(carry%10);
			carry/=10;
			p = p.next;
		}
		if(carry == 1) {
			p.next = new ListNode(carry);
		}
		return  head.next;
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


