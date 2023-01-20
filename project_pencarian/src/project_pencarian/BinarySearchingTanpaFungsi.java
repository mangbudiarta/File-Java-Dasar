package project_pencarian;

import java.util.Scanner;

public class BinarySearchingTanpaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N, x, k, i, j, temp;
		boolean ketemu;

		// code untuk menginputkan jumlah element array
		System.out.print("Masukan banyaknya angka = ");
		N = input.nextByte();

		// code untuk menginput nilai elemen array sesuai dengan jumlahnya
		for (i = 0; i < N; i++) {
			System.out.print("Masukan nilai elemen array ke-" + i + " = ");
			L[i] = input.nextByte();
		}

		// code untuk menginput elemen yang dicari
		System.out.print("Masukan angka yang mau dicari= ");
		x = input.nextByte();

		// code untuk mengurutkan elemen array menaik dengan bubbleAscending
		for (i = 0; i < (N - 1); i++) {
			for (k = (byte) (N - 1); k > i; k--) {
				if (L[k] < L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
		}
		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menaik :");
		for (i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}

		// code untuk pencarian dalam larik terurut menaik
		System.out.println("Pencarian dalam larik terurut menaik :");
		k = 0;
		i = 0;
		j = (byte) (N - 1);
		ketemu = false;
		while ((ketemu == false) && (i <= j)) {
			k = (byte) ((i + j) / 2);
			if (L[k] == x) {
				ketemu = true;
			} else {
				if (L[k] < x) {
					i = (byte) (k + 1);
				} else {
					j = (byte) (k - 1);
				}
			}
		}
		if (ketemu == true) {
			System.out.println("Angka " + x + " ditemukan di larik indeks ke-" + k);
		} else {
			System.out.println("Angka " + x + " tidak ditemukan dalam larik");
		}
		System.out.println();

		// code untuk mengurutkan elemen array menurun dengan bubbleDescending
		for (i = 0; i < (N - 1); i++) {
			for (k = (byte) (N - 1); k > i; k--) {
				if (L[k] > L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
		}
		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menurun :");
		for (i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}

		// code untuk pencarian dalam larik terurut menurun
		System.out.println("Pencarian didalam larik terurut menurun: ");
		k = 0;
		i = 0;
		j = (byte) (N - 1);
		ketemu = false;
		while ((ketemu == false) && (i <= j)) {
			k = (byte) ((i + j) / 2);
			if (L[k] == x) {
				ketemu = true;
			} else {
				if (L[k] > x) {
					i = (byte) (k + 1);
				} else {
					j = (byte) (k - 1);
				}
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
