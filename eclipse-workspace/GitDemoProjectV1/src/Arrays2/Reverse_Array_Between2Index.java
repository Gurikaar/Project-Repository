package Arrays2;

import java.util.Scanner;

public class Reverse_Array_Between2Index {
	
	public static void swap (int []A, int l, int r) {
		int temp =A[l];
		A[l]=A[r];
		A[r]=temp;
	
	}
	
	
	  public static int[] reverseBetween(int n, int l, int r, int []A) {
		  int len = (r-l)/2;
			for(int i=0;i<=len;i++) {
				swap(A,l,r);
				l++;
				r--;
			}
			for(int i=0;i<n;i++) {
				System.out.print(A[i]+" ");
			}
			return A;
	  }
	  
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //length of an array
		int l = scn.nextInt(); 
		int r = scn.nextInt(); 
		int arr[] = new int[n]; 
		for (int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
	}

}
