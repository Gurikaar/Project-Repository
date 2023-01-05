package Arrays1;

import java.util.Scanner;

//Arrange an element 
// expected output: [1,3,5,6,4,2]
public class arr_Arrange {
	public static void arrange(int[] arr, int n) {
		int len = arr.length;
		int val = 1;
		int start = 0;
		int end = arr.length - 1;
		for (int i = 0; i < len; i++) {
			if (val % 2 == 1) {
				arr[start] = val;
				val++;
				start++;
			} else {
				arr[end] = val;
				val++;
				end--;

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
		arrange(arr, n);
	}

}
