package Arrays1;

import java.util.Scanner;

public class arr_swalp0and1 {

	public static void sortZeroesAndOne(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		if (arr.length <= 1) {
			return;
		}

		for (int i = left; i < right; i++) {

			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			while (arr[right] % 2 == 1 && left < right) {
				right--;
			}
			if (left < right) {
				int x = arr[left];
				arr[left] = arr[right];
				arr[right] = x;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		sortZeroesAndOne(arr);
	}

}
