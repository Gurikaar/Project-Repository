package Arrays1;

import java.util.Scanner;

public class arr_LinearSearch {
	 
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
		 int [] arr = new int[n] ;
			for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			}
			 int find = scn.nextInt();
			System.out.println(linearSearch(arr,find));
		}

}
