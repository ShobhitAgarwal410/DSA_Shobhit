package leetCode;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int arr[] = { 0 };

//		int arr[] = { 1, 0, 0, 0, 1, 0, 0 };
		System.out.println(canPlaceFlowers(arr, 2));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed.length == 1) {
			if (n == 1 && flowerbed[0] == 0) {
				return true;
			} else {
				return false;
			}
		}
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				if (i < flowerbed.length - 1) {
					if (flowerbed[i + 1] == 0) {
						if (i != 0 && flowerbed[i - 1] != 1) {
							flowerbed[i] = 1;
							n--;
							continue;
						}
						if (i == 0) {
							flowerbed[i] = 1;
							n--;
						}
					}
				} else {
					if (flowerbed[i - 1] == 0) {
						n--;
					}
				}
			}
		}
		return n == 0;
	}
}
