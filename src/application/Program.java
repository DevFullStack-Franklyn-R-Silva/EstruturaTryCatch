package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" "); // Alex Maria Bob Frank
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position! " + e);
		} catch (InputMismatchException e) {
			System.out.println("Input error! " + e);
		}
		System.out.println("End of program");
	}

}
