package Array_2D;

public class FindLargestColumnOrRowSum {

	public static void findLargest(int input[][]) {
		int sum=0,largestRow=Integer.MIN_VALUE,rn=0;
		
		if(input.length==0) {
			System.out.print("row 0 -2147483648");
			System.exit(rn);
		}
		
        for(int i=0;i<input.length;i++)
        {   
        	sum=0;
            for(int j=0;j<input[0].length;j++) {
        
                sum+=input[i][j];
            }
            if(sum>largestRow){
                largestRow=sum;
                rn=i;
                }
        }
	
    
        int sum1=0,largestCol=Integer.MIN_VALUE,cn=0;
        
        for(int j=0;j<input[0].length;j++) {
         sum1=0;
            for(int i=0;i<input.length;i++)
            {
                sum1+=input[i][j];
            }
         
            if(sum1>largestCol){
                largestCol=sum1;
                cn=j;
                }
        }
        
      //  System.out.println(sum1);
	if(largestRow>=largestCol)
    {
		System.out.print("row "+rn+" "+largestRow);


    }else if(largestRow<largestCol){
         System.out.print("column "+cn+" "+largestCol);


    }


	
	}

	public static void main(String[] args) {
		int arr2d[][] = { { 1, 6, 8 }, { 2, 5, 9 }, { 4, 7, 2 } };
		findLargest(arr2d);

	}

}
