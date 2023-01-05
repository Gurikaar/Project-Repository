package Array_2D;

import java.util.Scanner;

public class Taking_Input {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int col = scn.nextInt();
		int [][]arr = new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	
}

}
