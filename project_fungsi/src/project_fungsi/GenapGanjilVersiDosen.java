package project_fungsi;

import java.util.Scanner;

public class GenapGanjilVersiDosen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		char ulang;
		do {
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
			System.out.print("Apakah Anda mau menginputkan lagi?[y/t] = ");
			ulang = input.next().charAt(0);

		} while (Character.toUpperCase(ulang) == 'Y');
		if (Character.toUpperCase(ulang) != 'Y')
			System.out.println("Anda memilih berhenti menginputkan");
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
