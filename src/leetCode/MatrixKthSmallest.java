package leetCode;

public class MatrixKthSmallest {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
//		matrix = [[1,5,9],[10,11,13],[12,13,15]];
		int k = 8;
		MatrixKthSmallest obj = new MatrixKthSmallest();
		System.out.println(obj.kthSmallest(matrix, 8));
	}

	public int kthSmallest(int[][] matrix, int k) {
		int num;
		int i = matrix.length;
		int j = matrix[0].length;
		int div = k / i;
		int rem = k % i;
		num = matrix[div][rem-1];
		return num;
	}
}
