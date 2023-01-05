package Arrays1;

import java.util.Scanner;

public class arr_findDuplicate {
	 
	 public static int duplicateNumber(int arr[]) {
		int duplicate=0;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
					 
				 if(arr[j]!=arr[i] && i!=j){
					 continue;
				 }else {
					 duplicate =arr[j];
						break;
				 }
				
			 }
		 }
	    	return duplicate;
	    	
	    	
	    }
	 public static void main(String [] args) {
		 Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int [] arr = new int[n] ;
			for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			}
		
			System.out.println(duplicateNumber(arr));
		}

}
