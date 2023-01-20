package project_pengurutan;

import java.util.Scanner;

public class InsertionTanpaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N;

		// code untuk menginputkan jumlah element array
		System.out.print("Masukan banyaknya angka = ");
		N = input.nextByte();

		// code untuk menginput nilai elemen array sesuai dengan jumlahnya
		for (byte i = 0; i < N; i++) {
			System.out.print("Masukan nilai elemen array ke-" + i + " = ");
			L[i] = input.nextByte();
		}

		// code untuk mencetak elemen array sebelum diurutkan
		System.out.println("Elemen array sebelum diurutkan :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array sisip menaik
		for (byte i = 1; i < N; i++) {
			byte x = L[i];
			int j = i - 1;
			boolean ketemu = false;
			while ((j >= 0) && (ketemu == false)) {
				if (x < L[j]) {
					L[j + 1] = L[j];
					j--;
				} else {
					ketemu = true;
				}
			}
			L[j + 1] = x;
		}
		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan sisip menaik :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array sisip menurun
		for (byte i = 1; i < N; i++) {
			byte x = L[i];
			int j = i - 1;
			boolean ketemu = false;
			while ((j >= 0) && (ketemu == false)) {
				if (x > L[j]) {
					L[j + 1] = L[j];
					j--;
				} else {
					ketemu = true;
				}
			}
			L[j + 1] = x;
		}
		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan sisip menurun :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		input.close();
	}

}
