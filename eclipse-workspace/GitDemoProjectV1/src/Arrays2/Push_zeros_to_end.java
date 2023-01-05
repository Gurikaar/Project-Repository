package Arrays2;

public class Push_zeros_to_end {

	public static void PushZerosToEnd (int[] arr) {
		int j =0; //NonZero
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]!=0) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
					j++;
				}
			
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
	int A[] = {2,0,0,1,0,3,0};
	
	
	PushZerosToEnd(A);
	}

}
