package project_pengurutan;

import java.util.Scanner;

public class BiayaSekolah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int spp = 500000;
		String jalurSeleksi;
		byte i;
		long biayaSiswa[] = new long[5];
		char ulang;

		i = 0;
		do {
			System.out.print("Masukan jalur seleksi [peminatan atau prestasi atau tes] = ");
			jalurSeleksi = input.next();

			if ((jalurSeleksi.equals("peminatan")) || (jalurSeleksi.equals("prestasi"))
					|| (jalurSeleksi.equals("tes"))) {
				biayaSiswa[i] = hitungBiaya(jalurSeleksi) + spp;
				System.out.println("Biaya Siswa = " + biayaSiswa[i]);
				i = (byte) (i + 1);
				if (i > (5-1)) {
					System.out.println("Jumlah siswa sudah 5, tidak bisa input lagi");
					ulang = 't';
				} else {
					System.out.print("Anda mau mengulang ?[y atau t]= ");
					ulang = input.next().charAt(0);
					input.nextLine();
				}
			} else {
				System.out.println("Jalur seleksi  hanya peminatan, seleksi atau tes! Silahkan input kembali1");
				System.out.print("Anda mau mengulang ?[y atau t]= ");
				ulang = input.next().charAt(0);
				input.nextLine();
			}
		} while (Character.toUpperCase(ulang) == 'Y');
		if (i > 1) {
			System.out.println("Urutan biaya dari tertinggi ke terendah adalah : ");
			insertionMenurun(biayaSiswa, i);
		} else {
			System.out.println("Belum ada data yang diinput!");
		}
		input.close();

	}

	static int hitungBiaya(String jalurSeleksi) {
		if (jalurSeleksi.equals("peminatan")) {
			return (10475000);
		} else if (jalurSeleksi.equals("peminatan")) {
			return (10175000);
		} else {
			return (10775000);
		}
	}

	// code prosedur untuk mengurutkan array menurun
	public static void insertionMenurun(long L[], byte N) {
		for (byte i = 1; i < N; i++) {
			long x = L[i];
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
		cetak(L, N);
	}

	// code prosedur untuk mencetak elemen array
	public static void cetak(long L[], byte N) {
		for (byte i = 0; i < N; i++) {
			System.out.println("Elemen array ke-" + i + " = " + L[i]);
		}
		System.out.println();
	}

}
