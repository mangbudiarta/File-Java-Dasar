package project_pengurutan;

import java.util.Scanner;

public class SelectionSort {

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

		// code untuk memanggil prosedur
		System.out.println("Elemen array sebelum diurutkan : ");
		cetak(L, N);
		System.out.println("Elemen array setelah diurutkan pilih maksimum menaik : ");
		selectionMaksimumMenaik(L, N);
		System.out.println("Elemen array setelah diurutkan pilih maksimum menurun : ");
		selectionMaksimumMenurun(L, N);
		System.out.println("Elemen array setelah diurutkan pilih minimum menaik : ");
		selectionMinimumMenaik(L, N);
		System.out.println("Elemen array setelah diurutkan pilih minimum menurun : ");
		selectionMinimumMenurun(L, N);
		input.close();
	}

	// fungsi untuk mengurutkan array pilih maksimum menaik
	public static void selectionMaksimumMenaik(byte L[], byte N) {
		byte imax, temp;
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
		cetak(L, N);
	}

	// fungsi untuk mencetak array pilih maksimum menurun
	public static void selectionMaksimumMenurun(byte L[], byte N) {
		byte imax, temp;
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
		cetak(L, N);
	}

	// fungsi untuk mencetak array pilih minimum menaik
	public static void selectionMinimumMenaik(byte L[], byte N) {
		byte imin, temp;
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
		cetak(L, N);
	}

	// fungsi untuk mencetak aray pilih minimum menurun
	public static void selectionMinimumMenurun(byte L[], byte N) {
		byte imin, temp;
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
		cetak(L, N);
	}

	// code prosedur untuk mencetak elemen array
	public static void cetak(byte L[], byte N) {
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println();
	}

}
