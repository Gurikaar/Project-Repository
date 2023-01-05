package Arrays2;

public class Sum_of_Arrays {
/*
 * 1. A length is big
 * 2. B length is big
 * 3. Both array has same length with carry
 */
	 public static void sumOfTwoArrays(int arr1[], int arr2[]) {
		 int i = arr1.length-1;
		 int j = arr2.length-1;
		 int carry =0;
		 int result =0 ;
		 
		 while(i>=0 && j>=0) {
			 
			 int val1 = arr1[i];
			 int val2 = arr2[j];
			 
			 int sum = val1 +  val2 + carry;
			 carry = sum/10;
			 sum = sum%10;
			 
			result = sum;
			i--;
			j--;
		 }
		 
		 //First case
		 while(i>=0) {
			int  sum = arr1[1] + carry;
			sum = sum%10;
			 
			result = sum;
			i--;
		 }
		 // Second case 
		 while(j>=0) {
				int  sum = arr1[1] + carry;
				sum = sum%10;
				result = sum;
				j--;
			 }
		 // thirst case
		 while(carry!=0) {
			 int  sum = carry;
				sum = sum%10;
				result = sum;
		 }
//		 reverse(result);
		 System.out.println(result);
		
	}
	 
//	 public static void reverse(int arr1[], int arr2[]) {
	
	public static void main(String[] args) {
		
	int A[] = {6,7,8};
	int B[] = {5,9,2};

	
	sumOfTwoArrays(A,B);
	}

}
	 
//A = 9,9,86,6
//B
	 
	 
	 
	 
	 
	 
	 
