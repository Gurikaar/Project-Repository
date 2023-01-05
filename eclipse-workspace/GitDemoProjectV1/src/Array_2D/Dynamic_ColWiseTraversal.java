package Array_2D;

public class Dynamic_ColWiseTraversal {
	public static void printColumns(int[][] array) {
	    int largest = 0;
	    for (int[] i:array) {
	        if (i.length>largest) { // find the largest element in array
	            largest = i.length;
	        }
	    }
	    for (int i=0;i<largest;i++) {
	        for (int[] intArray : array) {
	            if (i < intArray.length) {  // check that you won't get an IndexOutOfBounds exception
	                System.out.print(intArray[i]+" ");
	            }
	        }
	    }
	    System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3}, {4,5}, {6,4,3,}, {1}, {7,8,9}};
		printColumns(a);
		
	}

	

}
