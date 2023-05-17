package leetCode;

public class SwapNodesInPair {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		SwapNodesInPair.swapPairs(head);
	}

	public static ListNode swapPairs(ListNode head) {
		if (head != null && head.next != null) {
			head = swap(head);
			ListNode node = head.next;
			while (node.next != null && node.next.next != null) {
				ListNode temp = node.next;
				node.next = node.next.next;
				node = swap(temp);
				node = node.next;
			}
		}
		return head;
	}

	private static ListNode swap(ListNode node) {
		ListNode temp = node;
		node = node.next;
		temp.next = node.next;
		node.next = temp;
		return node;
	}

}
