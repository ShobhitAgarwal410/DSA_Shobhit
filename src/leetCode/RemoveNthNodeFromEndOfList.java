package leetCode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		ListNode head6 = new ListNode(6);
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = null;
		ListNode result = removeNthFromEnd(head, 6);
		System.out.println(result);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		int i = 0;
		temp = head;
		if (count == n) {
			head = head.next;
			return head;
		}
		while (i < count - n) {
			if (i == count - n - 1) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
			i++;
		}
		return head;
	}
}
