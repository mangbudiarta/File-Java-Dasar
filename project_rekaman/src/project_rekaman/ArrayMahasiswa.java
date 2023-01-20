package project_rekaman;

import java.util.Scanner;

public class ArrayMahasiswa {

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
		input.close();
	}

}
