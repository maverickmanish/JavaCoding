package leetcode;

public class _23_MergeKLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeTwoLists(ListNode[] lists) {
		int length = lists.length;
		if (length==0) return null;
		 int end = length - 1;
		 while (end > 0) {
		 int begin = 0;
		 while (begin < end) {
		 lists[begin]= merge2Lists(lists[begin],
		 lists[end]);
		 begin++;
		 end--;
		 }
		 }
		 return lists[0];
		}
		private ListNode merge2Lists(ListNode l1, ListNode l2) {
		 ListNode dummyHead = new ListNode(0);
		 ListNode p = dummyHead;
		 while (l1 != null && l2 != null) {
		 if (l1.val < l2.val) {
		 p.next = l1;
		 l1 = l1.next;
		 } else {
		 p.next = l2;
		 l2 = l2.next;
		 }
		 p = p.next;
		 }
		 if (l1 != null) p.next = l1;
		 if (l2 != null) p.next = l2;
		 return dummyHead.next;
		}
}
