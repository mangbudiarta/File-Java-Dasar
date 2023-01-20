package project_pencarian;

import java.util.Scanner;
import project_pengurutan.*;

public class BinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N, x;

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

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menaik :");
		BubbleSort.bubbleAscending(L, N);

		// code untuk memanggil fungsi dalam larik terurut menaik
		System.out.println("Pencarian dalam larik terurut menaik :");
		binerMenaik(L, N, x);

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menurun :");
		BubbleSort.bubbleDescending(L, N);

		// code untuk memanggil fungsi dalam larik terurut menaik
		System.out.println("Pencarian dalam larik terurut menurun:");
		binerMenurun(L, N, x);
		input.close();
	}
	//fungsi pencarian biner terurut menaik
	public static void binerMenaik(byte L[],byte N,byte x) {
		byte k= 0;
	byte i = 0;
		byte j = (byte) (N - 1);
		boolean ketemu = false;
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
	}
	//fungsi pencarian biner terurut menurun
	public static void binerMenurun(byte L[],byte N,byte x) {
		byte k = 0;
		byte i = 0;
		byte j = (byte) (N - 1);
		boolean ketemu = false;
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
	}
}
