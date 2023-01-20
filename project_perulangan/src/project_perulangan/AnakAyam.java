package project_perulangan;

import java.util.Scanner;

public class AnakAyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte n, i;

		System.out.print("Masukan jumlah anak ayam= ");
		n = input.nextByte();

		System.out.println("Anak Ayam turun " + n);
		for (i = 10; i >= 2; i--) {
			System.out.println("Anak Ayam turun " + i + ", mati satu tinggal " + (i - 1));
		}
		System.out.print("Anak Ayam turun " + i + ", mati satu tinggal induknya");
		input.close();
	}

}
