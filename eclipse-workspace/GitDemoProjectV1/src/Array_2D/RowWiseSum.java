package Array_2D;

public class RowWiseSum {
	public static void rowWiseSum(int[][] array) {
		int[] total = new int[array.length];
	    for (int i = 0; i < array.length; i++) {
	        for (int k = 0; k < array[i].length; k++) {
	          	total[i] += array[i][k];
	        }
			System.out.print(total[i] + " ");
			
	    }

	}
	public static void main(String[] args) {
		int[][] arr2d = {{4,5,3,2,6},{7,5,3,8,9}};
		rowWiseSum(arr2d);


	}

}
