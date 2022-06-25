package leetcode;
/* Definition for singly-linked list. */


/*We introduce a preDelete pointer first and place it at the beginning
 *  of the linked list.

Move head pointer first so that the distance between preDelete and 
head pointer would be N nodes.
Move head and preDelete pointer together until head is reaching to the end.
Modify preDelete pointing node.next to the next node of the delete node.*/
 
 
public class _19_RemoveNthFromEnd {
    
	static int length;
	static ListNode prevNode;
	public static void main(String[] args) {
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(4,n1);
		ListNode n3=new ListNode(3,n2);
		ListNode n4=new ListNode(2,n3);
		ListNode n5=new ListNode(1,n4);
		
		System.out.println(removeNthFromEnd(n5,2));
	}

	public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (n <= 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preDelete = dummy;
        
        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        
        while (head != null) {
            preDelete = preDelete.next;
            head = head.next;
        }
        
        preDelete.next = preDelete.next.next;
        
        return dummy.next;
    }
	
	    public static ListNode removeNthFromEnd(ListNode head, int n) {
	        if( (head.next==null && n==1))
	        	return null;
	        listLength(head);
	        int fromStart=length-n+1;
	        
	        if(fromStart==length)
	        	prevNode.next=null;
	        else if(fromStart==1)
	        	head=head.next;
	        else
	        {
	        	int i=0;
	        	prevNode=head;
                ListNode delete=null,end=null;;
                delete=prevNode.next;
               while(i<fromStart-2)
	        	{
                   
	        		prevNode=prevNode.next;
	        		 delete=prevNode.next;
	        		i++;
	        	}
	        	end=delete.next;
                delete.next=null;
                prevNode.next=end;    
	        }
	        	
return head;
	}

	    public static void listLength(ListNode head )
	    {  length=1;
	    	while(head.next!=null)
	    	{
	    		prevNode=head;
	    		head=head.next;
	    		length++;
	    	}
	    }
}
