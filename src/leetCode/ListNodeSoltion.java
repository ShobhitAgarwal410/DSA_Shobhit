package leetCode;

public class ListNodeSoltion {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
//		ListNode head3 = new ListNode(3);
//		ListNode head4 = new ListNode(4);
//		ListNode head5 = new ListNode(5);
//		ListNode head6 = new ListNode(6);
		head.next = head2;
//		head2.next = head3;
//		head3.next = head4;
//		head4.next = head5;
//		head5.next = head6;
		head2.next = null;
		ListNodeSoltion.swapNodes(head, 1);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		if (temp == null)
			return null;
		while (temp != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	public static ListNode swapNodes(ListNode head, int k) {
		ListNode temp = head;
		int n = 1;
		while (temp.next != null) {
			System.out.println(temp.val);
			n++;
			temp = temp.next;
		}
		ListNode temp2 = head;
		boolean flag = false;
		int value = 0;
		if (k == n - k + 1) {
			return head;
		} else if (k < n - k + 1) {
			int val = 0;
			for (int i = 2; i <= n - k + 1; i++) {
				temp2 = temp2.next;
				if (i == k) {
					val = temp2.val;
				}
				if (i == n - k + 1) {
					value = temp2.val;
					temp2.val = val;
				}
			}
		} else {
			int val = 0;
			flag = true;
			for (int i = 2; i <= k; i++) {
				temp2 = temp2.next;
				if (i == n - k + 1) {
					val = temp2.val;
				}
				if (i == k) {
					value = temp2.val;
					temp2.val = val;
				}
			}
		}
		ListNode temp3 = head;
		if (flag) {
			for (int i = 2; i <= n - k + 1; i++) {
				temp3 = temp3.next;
				if (i == n - k + 1) {
					temp3.val = value;
				}
			}
		} else {
			for (int i = 2; i <= k; i++) {
				temp3 = temp3.next;
				if (i == k) {
					temp3.val = value;
				}
			}
		}

		
		return head;
	}

}
