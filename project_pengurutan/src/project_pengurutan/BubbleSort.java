package project_pengurutan;

import java.util.Scanner;

public class BubbleSort {

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
		System.out.println("Elemen array setelah diurutkan menaik : ");
		bubbleAscending(L, N);
		System.out.println("Elemen array setelah diurutkan menurun : ");
		bubbleDescending(L, N);
		input.close();
	}

	// code prosedur untuk mengurutkan elemen array menaik
	public static void bubbleAscending(byte L[], byte N) {
		byte temp;
		for (byte i = 0; i < (N - 1); i++) {
			for (byte k = (byte) (N - 1); k > i; k--) {
				if (L[k] < L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
		}
		cetak(L, N);
	}

	// code prosedur untuk mengurutkan elemen array menurun
	public static void bubbleDescending(byte L[], byte N) {
		byte temp;
		for (byte i = 0; i < (N - 1); i++) {
			for (byte k = (byte) (N - 1); k > i; k--) {
				if (L[k] > L[k - 1]) {
					temp = L[k];
					L[k] = L[k - 1];
					L[k - 1] = temp;
				}
			}
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
//pakai void karena outputnya lebih dari 1
//jika output hanya 1, maka gunakan fungsi seperti static float
