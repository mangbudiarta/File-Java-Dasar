package project_fungsi;

import java.util.Scanner;

public class GenapGanjil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Masukan sebuah bilangan = ");
		n = input.nextInt();

		if (n > 0) {
			if (Genap(n) == true)
				System.out.println(n + " adalah bilangan genap");
			else
				System.out.println(n + " adalah bilangan ganjil");

		} else {
			System.out.println("Masukan bilangan bulat diatas 0!!");
		}
		input.close();
	}

	static boolean Genap(int n) {
		if (n % 2 == 0) {
			return (true);
		} else {
			return (false);
		}
	}

}
