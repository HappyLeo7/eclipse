package zxzx;

import java.util.Arrays;

public class cl {
	public static int max(int arr[]) {
		if (arr == null || arr.length == 0)
			return -999999;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

		}
		return max;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(Arrays.toString(data));
		System.out.println(max(data));
	}
}
