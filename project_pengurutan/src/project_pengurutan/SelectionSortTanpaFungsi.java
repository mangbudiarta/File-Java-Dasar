package project_pengurutan;

import java.util.Scanner;

public class SelectionSortTanpaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte L[] = new byte[100];
		byte N, temp, imax, imin;

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

		// code untuk mengurutkan elemen array maksimum menaik
		for (byte i = (byte) (N - 1); i >= 1; i--) {
			imax = 0;
			for (byte j = 1; j <= i; j++) {
				if (L[j] > L[imax]) {
					imax = j;
				}
			}
			temp = L[i];
			L[i] = L[imax];
			L[imax] = temp;
		}

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan maksimum menaik :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array maksimum menurun
		for (byte i = 0; i < (N - 1); i++) {
			imax = i;
			for (byte j = (byte) (i + 1); j < N; j++) {
				if (L[j] > L[imax]) {
					imax = j;
				}
			}
			temp = L[i];
			L[i] = L[imax];
			L[imax] = temp;
		}

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan maksimum menurun :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array minimum menaik
		for (byte i = 0; i < (N - 1); i++) {
			imin = i;
			for (byte j = (byte) (i + 1); j < N; j++) {
				if (L[j] < L[imin]) {
					imin = j;
				}
			}
			temp = L[i];
			L[i] = L[imin];
			L[imin] = temp;
		}

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan minimum menaik :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println(" ");

		// code untuk mengurutkan elemen array minimum menurun
		for (byte i = (byte) (N - 1); i >= 1; i--) {
			imin = 0;
			for (byte j = 1; j <= i; j++) {
				if (L[j] < L[imin]) {
					imin = j;
				}
			}
			temp = L[i];
			L[i] = L[imin];
			L[imin] = temp;
		}

		// code untuk mencetak elemen array setelah diurutkan
		System.out.println("Elemen array setelah diurutkan minimum menurun :");
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		input.close();
	}

}
