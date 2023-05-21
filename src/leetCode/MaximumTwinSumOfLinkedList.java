package leetCode;

public class MaximumTwinSumOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int pairSum(ListNode head) {
		ListNode temp = head;
		int n = 0;
		int[] arr = new int[100000];
		while (temp != null) {
			n++;
			arr[n] = temp.val;
			temp = temp.next;
		}
		int j = n - 1;
		int maxSum = 0, sum = 0;
		for (int i = 0; i < n / 2; i++) {
			sum += arr[i] + arr[j];
			j--;
			maxSum = maxSum < sum ? sum : maxSum;
		}
		return maxSum;
	}
}
