package Arrays1;

import java.util.Scanner;

public class arr_ArraySum {
	 
	public static int sum(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp += arr[i];	
		}
	    	return temp;
	    	
	    }
	 public static void main(String [] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int [] arr = new int[n] ;
			for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			}
	
			System.out.println(sum(arr));
		}

}
