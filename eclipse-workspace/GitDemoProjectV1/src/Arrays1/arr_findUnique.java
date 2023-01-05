package Arrays1;

import java.util.Scanner;
//Find Unique

public class arr_findUnique {
	public static int findUnique(int[] arr) {
		int unique = 0;

		for (int i = 0; i < arr.length; i++) {
			int count =1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] ==arr[i] && i!=j ) {
					count++;
					break;
				}
			}
			if(count ==1) {
				unique = arr[i];
				break;
			}
		}
		return unique;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(findUnique(arr));
	}

	// 
}
