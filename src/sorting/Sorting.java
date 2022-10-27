package sorting;

public class Sorting {
	static int n;

	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };
		n = arr.length;
		int sortedArr[] = new int[n];
		sortedArr = bubbleSort(arr);
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
	
	private static int[] mergeSort(int[] arr) {
		
		

		return arr;
	}
	
	private static void divide(int arr[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid = (si+(ei-si))/2;
		divide(arr,si, mid);
		divide(arr, mid+1, ei);
		conquer(arr,si,mid,ei);
	}

	private static void conquer(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		
	}
	

}
