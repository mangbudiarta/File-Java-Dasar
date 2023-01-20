package project_fungsi;

import java.util.Scanner;

public class PersegiPanjangVersiDosen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float p, l;
		byte pilihan;

		do {
			System.out.println("MENU");
			System.out.println("1. Hitung Luas Persegi Panjang");
			System.out.println("2. Hitung Keliling Persegi Panjang");
			System.out.println("3. Keluar Program");
			System.out.print(" Masukan pilihan Anda (1/2/3) = ");
			pilihan = input.nextByte();

			if (pilihan == 3)
				System.out.println("Anda memilih menu keluar program");
			else if ((pilihan != 1) && (pilihan != 2))
				System.out.println("Pilihan Anda Salah!!!");
			else {
				System.out.print("Masukan nilai panjang = ");
				p = input.nextFloat();

				System.out.print("Masukan nilai lebar = ");
				l = input.nextFloat();

				if (pilihan == 1) {
					System.out.println("Anda memilih Menu Hitung Luas Persegi Panjang");
					System.out.println("Panjang Persegi Panjang = " + p + " cm");
					System.out.println("Lebar Persegi Panjang = " + l + " cm");
					HitungLuas(p, l);
				} else if (pilihan == 2) {
					System.out.println("Anda memilih Menu Hitung Keliling Persegi Panjang");
					System.out.println("Panjang Persegi Panjang = " + p + " cm");
					System.out.println("Lebar Persegi Panjang = " + l + " cm");
					HitungKeliling(p, l);
				}
			}

		} while (pilihan != 3);
		input.close();

	}

	static void HitungLuas(float p, float l) {
		float ls = p * l;
		System.out.println("Luas persegi panjang = " + ls + " cm2");

	}

	static void HitungKeliling(float p, float l) {
		float kll = 2 * (p + l);
		System.out.println("Keliling persegi panjang = " + kll + " cm");

	}

}
