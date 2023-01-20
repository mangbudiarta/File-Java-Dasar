package project_rekaman;

import java.util.Scanner;

public class ArrayMahasiswaFungsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Mahasiswa[] mhs = new Mahasiswa[3];

		for (byte i = 0; i < mhs.length; i++) {
			System.out.print("Masukan Nim Mahasiswa = ");
			String nim = input.next();
			input.nextLine();

			System.out.print("Masukan Nama Mahasiswa = ");
			String namaMhs = input.nextLine();

			System.out.print("Masukan Nilai Mahasiswa = ");
			float nilai = input.nextFloat();

			mhs[i] = new Mahasiswa(nim, namaMhs, nilai);
		}
		System.out.println("\n");

		for (byte i = 0; i < mhs.length; i++) {
			System.out.println("Data Mahasiswa: ");
			System.out.println("Nim Mahasiswa = " + mhs[i].nim());
			System.out.println("Nama Mahasiswa = " + mhs[i].nama());
			System.out.println("Nilai Mahasiswa = " + mhs[i].nilai());
		}

		// memanggil fungsi hitungRataRata
		System.out.println("Rata-rata nilai mahasiwa = " + hitungRataRata(mhs.length, mhs));
		input.close();
	}

	// fungsi menghitung rata-rata nilai elemen array
	public static float hitungRataRata(int N, Mahasiswa[] mhs) {
		float jumlah = 0;
		for (byte i = 0; i < N; i++) {
			jumlah += mhs[i].nilai();
		}
		float rata = (float) jumlah / N;
		return rata;
	}
}
