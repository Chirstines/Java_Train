package other.folder01;
import java.util.Scanner;

public class FactorsPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		System.out.print( " Input an integer: " );
		int number = in.nextInt();
		in.close();
		
		System.out.println(countFactors(number));
	}

	public static int countFactors(int number) {
		int counter = 0;
		for ( int i = 1; i <= (int)Math.sqrt(number); i++) {
			if ((number % i == 0) && (i*i != number)) {
				counter += 2;
			} else if (i*i == number) {
			  counter++;
			}
		}
		return counter;
	}
}
