package Array_2D;

public class FindColumnSum {

	public static int largestColSum(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
	
		for(int i=0;i<cols;i++) {
			int sum =0;
			for (int j=0;j<rows;j++) {
					sum = sum + arr[i][j];
					
				}
			if(sum >largest) 
				largest = sum;
			
					}
		return largest;
		
	}
	public static void main(String[] args) {
		int arr2d[][]= {{1,6,8},{2,5,9},{4,7,2}};
		System.out.println(largestColSum(arr2d));
		

	}

}
