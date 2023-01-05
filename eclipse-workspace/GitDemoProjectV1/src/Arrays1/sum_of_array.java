package Arrays1;
import java.util.Scanner;
public class sum_of_array {

	// sum of n integers in an array
	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			//System.out.println("Enter the " + i + " element");
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int sum(int[] arr) {
		int n= arr.length;
		int add=0;
		for(int i=0;i<n;i++){
			add+=arr[i];
		}
		return add;
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		System.out.println(sum(arr));
		

	}
}
