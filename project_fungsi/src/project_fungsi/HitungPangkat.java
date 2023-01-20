package project_fungsi;

import java.util.Scanner;

public class HitungPangkat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float x;
		int n;

		System.out.print("Masukan angka= ");
		x = input.nextFloat();

		System.out.print("Masukan nilai pangkat = ");
		n = input.nextInt();

		System.out.println("Hasil dari " + x + " pangkat " + n + " adalah " + Pangkat(x, n));
		input.close();
	}

//	static int Pangkat(float x, int n) {
//		// pangkat dengan metode Math.pow(nilai,pangkat)
//		int i = (int) Math.pow(x, n);
//		return (i);
//	}

	static int Pangkat(float x, int n) {
		// pangkat dengan perulangan
		byte i;
		int hasil = 1;
		for (i = 1; i <= n; i++) {
			hasil = (int) x * hasil;
		}

		return hasil;
	}
}
