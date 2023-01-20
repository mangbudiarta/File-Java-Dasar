package project_fungsi;

import java.util.Scanner;

public class HitungPangkatVersiDosen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float x;
		int n;
		char ulang;
		do {
			System.out.print("Masukan angka= ");
			x = input.nextFloat();

			System.out.print("Masukan nilai pangkat = ");
			n = input.nextInt();
			System.out.println("Hasil dari " + x + " pangkat " + n + " adalah " + Pangkat(x, n));

			System.out.print("Apakah Anda mau menginputkan lagi?[y/t] = ");
			ulang = input.next().charAt(0);

		} while (Character.toUpperCase(ulang) == 'Y');
		if (Character.toUpperCase(ulang) != 'Y')
			System.out.println("Anda memilih berhenti menginputkan");

		input.close();
	}

//	static float Pangkat(float x, int n) {
//		// pangkat dengan metode Math.pow(nilai,pangkat)
//		float hasil = (float) Math.pow(x, n);
//		if (n < 0) {
//			return (1f / hasil);
//		} else {
//			return (hasil);
//		}
//	}

	static float Pangkat(float x, int n) {
		// pangkat dengan perulangan
		float hasil = 1f;
		for (byte i = 1; i <= Math.abs(n); i++) {
			hasil = hasil * x;
		}
		if (n < 0) {
			return (1f / hasil);
		} else {
			return (hasil);
		}
	}

}
