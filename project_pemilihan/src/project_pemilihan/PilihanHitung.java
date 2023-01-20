package project_pemilihan;

import java.util.Scanner;

public class PilihanHitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float luas, keliling, p, l;
		byte pilihan;
		
		System.out.print("Masukan panjang = ");
		p = input.nextFloat();
		System.out.print("Masukan lebar = ");
		l = input.nextFloat();
		System.out.println("MENU");
		System.out.println("--------------------------------");
		System.out.println("1 Luas Empat Persegi Panjang");
		System.out.println("2 Keliling Empat Persegi Panjang");
		System.out.println("3 Keluar Program");
		System.out.print("Masukan pilihan Anda [1/2/3] = ");
		pilihan = input.nextByte();
		if (pilihan == 1) {
			System.out.println("Menghitung Luas Empat Persegi Panjang");
			luas = p * l;
			System.out.println("Luas Persegi Panjang = "+luas);
		}else if (pilihan == 2) {
			System.out.println("Menghitung Keliling Empat Persegi Panjang");
			keliling = 2 * (p + l);
			System.out.println("Luas Persegi Panjang = "+keliling);
		}else {
			System.out.println("Keluar Program");
		}
		input.close();

	}

}
