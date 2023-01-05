package Arrays1;
import java.util.Scanner;
public class Largest_of_n_num {

	// Largest of n numbers
	public static int[] takeInput() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int Largest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		int Lar = Largest(arr);
		System.out.println(Lar);
//		System.out.println(Largest(arr));
		

	}
}
