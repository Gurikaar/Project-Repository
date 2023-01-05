package Array_2D;

//import javafx.util.Pair;
//Find the matix is square or not and print it's diagonals 
public class Square_Matrix {
    public static void sqrMat(int [][]mat, int n, int m) {
        // Write your code here.
    	if(n ==m) {
    		System.out.println("Yes");
        	int[] arr = new int[n];
        	 for (int i=0;i<n;i++) {
        		 arr[i]=mat[i][i];
        		 System.out.print(arr[i] + " ");
        	 }
        	 
        	
//              Pair<String, int[]> pair = new Pair<>("YES", arr);
//              return pair;
         }
//         int[] arr = new int[n];
//          Pair<String, int[]> pair = new Pair<>("NO", arr);
//          return pair; 
    	else {
    		System.out.println("No");
    	}
    }
    
    
    public static void main(String[] args) {
    	int[][] arr2d = {{4,5,3},{7,5,3},{7,5,3}};
    	sqrMat(arr2d, arr2d.length,arr2d[0].length);
	}
}
