package Arrays2;

public class MoveAllNegativeNumbers {

	public static void SeprateNeativesFromPostives (int[] arr) {
		int n = arr.length;
		int j =0; //NonZero
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]<0) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					j++;
				}
			
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
	int A[] = {1,2, -3, 4, -4, 5};
	
	
	SeprateNeativesFromPostives(A);
	}
}
