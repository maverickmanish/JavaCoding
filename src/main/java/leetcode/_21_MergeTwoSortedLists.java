package leetcode;

public class _21_MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode preDummy = new ListNode(-101);
		ListNode traveseNode = preDummy;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				traveseNode.next = list1;
				traveseNode = list1;
				list1 = list1.next;
			} else {
				traveseNode.next = list2;
				traveseNode = list2;
				list2 = list2.next;
			}

		}
		if (list1 != null)
			traveseNode.next = list1;
		else
			traveseNode.next = list2;
		return preDummy.next;
	}
}
