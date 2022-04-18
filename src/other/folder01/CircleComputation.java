package other.folder01;
/**
 * Print the area and circumferrence of a circle , given its radius.
 */
public class CircleComputation {    //Save as "CircleComputertion.java"
	public static void main(String[] args) {
		//Khai báo 2 biến kép để giữ bán kính, khu vực và chu vi.
		//A "double" holds floating-point number with an optional
		double radius; //The variable to hold radius value
		double area;   //The variable to hold radius area
		double circumference; //The variable to hold radius circumference
		
		//Declare a double to hold PI. Declare as "final" to specify that
		//its value cannot e changed (i.e. constant).
		final double PI = 3.13159265;
		
		//Assign a value to radius. (we shall read the value from the keyboard later)
		radius = 1.2;
		
		//Compute area and circumference
		area = radius * radius * PI;
		circumference = 2.0 * radius * PI;
		
		//Print results
		System.out.print("The radius is ");  //Print description
		System.out.println(radius); // Print he value stored in the varialble
		System.out.print("the area is ");
		System.out.println(area);
		System.out.print("The circumference is ");
		System.out.println(circumference);
	}
}
