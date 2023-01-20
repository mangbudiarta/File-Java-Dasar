package project_perulangan;

import java.util.Scanner;

public class DeretSegitigaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Byte N, baris, kolom;

		System.out.print("Masukan jumlah Deret= ");
		N = input.nextByte();

		baris = 1;
		do {
			kolom = 1;
			do {
				System.out.print("*");
				kolom++;
			} while (kolom <= baris);
			baris++;
			System.out.println();
			input.close();
		} while (baris <= N);
	}

}
