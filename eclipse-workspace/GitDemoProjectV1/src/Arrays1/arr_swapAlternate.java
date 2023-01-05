package Arrays1;

import java.util.Scanner;

public class arr_swapAlternate {
	 
	 public static void swapAlternate(int arr[]) {
		 
		 for(int i=0;i<arr.length-1;i+=2) {
			 int temp = arr[i];
			 arr[i]= arr[i+1];
			 arr[i+1]=temp;
			
		 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	 }
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
	
		swapAlternate(arr);
	
	}

}


