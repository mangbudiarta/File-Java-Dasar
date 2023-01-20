package project_pencarian;

import java.util.Scanner;

public class SequentialSearchingTanpaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N, x, k;
		boolean ketemu;

		// code untuk menginputkan jumlah element array
		System.out.print("Masukan banyaknya angka = ");
		N = input.nextByte();

		// code untuk menginput nilai elemen array sesuai dengan jumlahnya
		for (byte i = 0; i < N; i++) {
			System.out.print("Masukan nilai elemen array ke-" + i + " = ");
			L[i] = input.nextByte();
		}

		// code untuk menginput elemen yang dicari
		System.out.print("Masukan angka yang mau dicari= ");
		x = input.nextByte();

		// code pencarian versi 1
		System.out.println("Versi 1");
		k = 0;
		while ((k < N) && (L[k] != x)) {
			k++;
		}
		if (L[k] == x) {
			System.out.println("Angka " + x + " ditemukan di larik indeks ke-" + k);
		} else {
			System.out.println("Angka " + x + " tidak ditemukan dalam larik");
		}

		// code versi 2
		System.out.println("Versi 2");
		k = 0;
		ketemu = false;
		while ((k < N) && (ketemu != true)) {
			if (L[k] == x) {
				ketemu = true;
			} else {
				k++;
			}
		}
		if (ketemu == true) {
			System.out.println("Angka " + x + " ditemukan di larik indeks ke-" + k);
		} else {
			System.out.println("Angka " + x + " tidak ditemukan dalam larik");
		}
		input.close();
	}

}
