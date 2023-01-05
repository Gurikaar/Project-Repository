package Array_2D;

public class Column_Wise_Traversal {
	public static int[] printColWise(int [][]a) {
		int row=a.length;
		int col=a[0].length;
	     int[] b = new int[row*col];
	    int k=0;
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				b[k]= a[j][i];
				k+=1;
				
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int[][] a = { { 4, 3, 6 }, { 2, 1 ,9} };
		int []arr =printColWise(a);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
