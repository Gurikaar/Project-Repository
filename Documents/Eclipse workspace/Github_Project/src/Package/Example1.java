package Package;

public class Example1 {

	public static void main(String[] args) {
	
		int[]a = new int[0];
		System.out.println("This prints");
		try {
		int[]b = new int[-1];
		}catch(Exception e)
		{
			System.out.println("NegativeArraySizeException");
		}
	}

}
