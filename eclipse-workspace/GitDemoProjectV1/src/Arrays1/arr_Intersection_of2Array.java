package Arrays1;

import java.util.Scanner;

public class arr_Intersection_of2Array {
	 
	 public static void intersections(int arr1[], int arr2[]) {
	        int a = arr1.length;
	        int b = arr2.length;

	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                if (arr1[i] == arr2[j]) {
	                    System.out.print(arr1[i] + " ");
	                    arr2[j] = Integer.MIN_VALUE;
	                    break;

	                }
	            }
	        }
	    }
	    

	 
	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			int m = scn.nextInt();
			int[] arr1 = new int[m];
			
			for (int j = 0; j < n; j++) {
				arr1[j] = scn.nextInt();
			}
			intersections(arr,arr1);
		}

}
