package leetCode;

public class ListNodeSoltion {

	public static void main(String[] args) {
		ListNodeSoltion obj = new ListNodeSoltion();
		ListNode head = new ListNode(1);
		obj.deleteDuplicates(head);
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		if (temp == null)
			return null;
		while (temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

}
