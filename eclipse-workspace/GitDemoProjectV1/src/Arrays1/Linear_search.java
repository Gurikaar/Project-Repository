package Arrays1;

import java.util.Scanner;

public class Linear_search {
//Linear search
/*
 * 1. provide size and input array 
 * 2. take the value of x and find it in the array	
 */

	 public static int linearSearch(int arr[], int x) {
		  for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) 
				return i;
			

		  }
			return -1;
	    }
	
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
		arr1[i]=scn.nextInt();
		}
		
		int find = scn.nextInt();
	System.out.print(linearSearch(arr1,find));
	}


}
