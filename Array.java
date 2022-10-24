import java.util.Collections;

public class Array {

	public static void main(String[] args) {


		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		double target;
		
		double total;


		for(double x: values)
			
			System.out.print(x + " ");
		
		System.out.println(" ");

	    double max = values[0];
	    
	    for(double s : values) 
	    {
		if(s > max) max = s;
	    }
		System.out.println("The maximum element is " + max);
		
		int count = 0;
		
		for(double n: values) {
			
			if (n < 0) count = count + 1;
			
		}
		
		System.out.println("There are " + (count) + " negative numbers within the array.");
	}
}