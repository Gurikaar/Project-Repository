package Arrays1;

import java.util.Scanner;

public class printing_array {
//Taking input and printing an array
/*
 * 1. We need the size of an array from the user	
 * 2. That I'll store it n an array variable 
 * 3. iterate to store an element
 * 4. I'm fetching an array with the help of another loop
 */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+ i + " element");
			arr[i]= scn.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
