package project_pengurutan;

import java.util.Scanner;

public class BubbleSortTanpaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N, temp;

		// code untuk menginputkan jumlah element array
		System.out.print("Masukan banyaknya angka = ");
		N = input.nextByte();

		// code untuk menginput nilai elemen array sesuai dengan jumlahnya
		for (byte i = 0; i < N; i++) {
			System.out.print("Masukan nilai elemen array ke-" + i + " = ");
			L[i] = input.nextByte();
		}

		// code untuk mencetak elemen array sebelum diurutkan
		System.out.println("Elemen array sebelum diurtutkan :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array menaik
		for (byte i = 0; i < (N - 1); i++) {
			for (byte k = (byte) (N - 1); k > i; k--) {
				if (L[k] < L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
		}
		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menaik :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}

		// code untuk mengurutkan elemen array menurun
		for (byte i = 0; i < (N - 1); i++) {
			for (byte k = (byte) (N - 1); k > i; k--) {
				if (L[k] > L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
		}
		System.out.println(" ");

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan menurun :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		input.close();
	}

}
