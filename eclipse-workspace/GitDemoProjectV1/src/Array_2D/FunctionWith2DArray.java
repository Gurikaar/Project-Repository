package Array_2D;

import java.util.Scanner;

public class FunctionWith2DArray {
	
	public static void print2dArray(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");		
				}
			System.out.println();
		}
		
	}

	public static int[][]TakeInput(){
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] array2d = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				array2d[i][j]= scn.nextInt();			}
		}
		return array2d;
	}
	
	
	
	public static void main(String[] args) {
	
		int input[][]=TakeInput();
		print2dArray(input);
	}

}
