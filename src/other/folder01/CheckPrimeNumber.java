package other.folder01;
import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = in.nextInt();
		in.close();
		
		System.out.println("The given number is a prime number: " + isPrime(number));
	}
	
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		
		for(int i = 2; i <= (int)Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
