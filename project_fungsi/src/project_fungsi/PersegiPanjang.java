package project_fungsi;

import java.util.Scanner;

public class PersegiPanjang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float p, l;
		byte pilihan;

		System.out.print("Masukan nilai panjang = ");
		p = input.nextFloat();

		System.out.print("Masukan nilai lebar = ");
		l = input.nextFloat();

		System.out.println("[1] Menghitung Luas Persegi Panjang / [2]Menghitung Keliling Persegi Panjang");
		System.out.print("Masukan piihan anda[1/2]= ");
		pilihan = input.nextByte();

		if (pilihan == 1) {
			HitungLuas(p, l);
		} else if (pilihan == 2) {
			HitungKeliling(p, l);
		}else {
			System.out.println("pilihan anda salah!!");
		}
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
