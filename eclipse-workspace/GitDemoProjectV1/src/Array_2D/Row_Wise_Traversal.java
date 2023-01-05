package Array_2D;

public class Row_Wise_Traversal {
	public static int[] printRowWise(int[][] a) {
		int numberOfRows = a.length;
		int numberOfColumns = a[0].length;
		int arr[] = new int[numberOfColumns* numberOfRows];
		int k = 0;
       	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) { // a[0] is because we know it's a static 2 d array and length of the array will not change 
				arr[k] = a[i][j];
				k++;
			}
		}
		
		return arr;

	}

	public static void main(String[] args) {

		int[][] a = { { 4, 3 }, { 2, 1 } };
		int []arr =printRowWise(a);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
