package Arrays2;

import java.util.Scanner;

public class RotateArray {
	
    public static int[] rotateArray(int []a, int x, String dir) {
		 int n = a.length;

	        // Performing the 'X' operation is the same as
	        // performing 'X' % 'N' operations
	        x %= n;

	        // If we have to rotate 'LEFT'
	        if (dir.equals("LEFT")) {

	            // Rotate 'X' times.
	            for (int i = 0; i < x; i++) {
	                rotateLeft(a);
	            }
	        }
	        // If we have to rotate 'RIGHT'
	        else if (dir.equals("RIGHT")) {

	            // Rotate 'X' times.
	            for (int i = 0; i < x; i++) {
	                rotateRight(a);
	                
	            }
	           
	        }

	        // Return the rotated array 'a'.
	        return a;
	    }
	    public static void rotateLeft(int []a) {

	        int n = a.length;

	        // Initialize an integer variable 'temp' with a[0].
	        int temp = a[0];

	        // Shift elements to left.
	        for (int i = 0; i < n - 1; i++) {
	            a[i] = a[i + 1];
	        }

	        // Update the last index.
	        a[n - 1] = temp;
	    }
	    public static void rotateRight(int []a) {

	        int n = a.length;

	        // Initialize an integer variable 'temp' with a[n-1].
	        int temp = a[n - 1];

	        // Shift elements to left.
	        for (int i = n - 2; i >= 0; i--) {
	            a[i + 1] = a[i];
	        }

	        // Update the last index.
	        a[0] = temp;
	    }
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //length of an array
		int X = scn.nextInt(); // number of rotation
		String dir = scn.next(); // direction f rotation
		int arr[] = new int[n]; // Array 
		for (int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		int A[] =rotateArray(arr,X,dir);
//		rotateArray(A,n,X,dir);
	}

}
