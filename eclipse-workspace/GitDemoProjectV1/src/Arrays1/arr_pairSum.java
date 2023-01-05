package Arrays1;

import java.util.Scanner;

public class arr_pairSum {

	public static int pairSum(int arr[], int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x)
					count += 1;

			}
		}return count;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int find = scn.nextInt();
		System.out.println(pairSum(arr, find));
	}

}
