package leetcode;

public class _25_reverseKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(4,n1);
		ListNode n3=new ListNode(3,n2);
		ListNode n4=new ListNode(2,n3);
		ListNode n5=new ListNode(1,n4);
		
		System.out.println(reverseKGroup(n5,3));
		
	}
	 public static ListNode reverseKGroup(ListNode head, int k) {
	      //base case
	        if(head.next == null) return head;
	        if(k == 1) return head;
	        
	        //define pre and cur
	        ListNode dummy = new ListNode();
	        dummy.next = head;
	        ListNode pre = dummy, cur = head;
	        
	        //reverse the list
	        while(cur != null){
	            boolean space = checkHasSpace(k, cur);
	            if(space){
	                pre = reverse(pre, cur, k);
	                cur = pre.next;
	            }else{
	                break;
	            }
	        }
	        //return the head
	        return dummy.next;
	    }
	    private static boolean checkHasSpace(int k, ListNode cur){
	       for(int i = 1; i <= k; i++){
	           if(cur == null) return false;
	           cur = cur.next;
	       }
	        return true;
	    }
	    private static ListNode reverse(ListNode pre, ListNode cur, int k){
	        for(int i = 0; i < k - 1; i++){
	            ListNode nex = cur.next;
	            cur.next = nex.next;
	            nex.next = pre.next;
	            pre.next = nex;
	        }
	        return cur;
	    }
	}