package project_perulangan;

import java.util.Scanner;

public class RataNilaiMhs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte mhs, matkul, i, j;
		float nilai, jumlah, rata;

		System.out.print("Masukan jumlah mahasiswa =");
		mhs = input.nextByte();
		System.out.print("Masukan jumlah matakuliah=");
		matkul = input.nextByte();

		for (i = 1; i <= mhs; i++) {
			jumlah = 0;
			for (j = 1; j <= matkul; j++) {
				System.out.print("Mahasiswa ke-" + i + ", maasukan nilai MK ke-" + j + "= ");
				nilai = input.nextFloat();
				jumlah = jumlah + nilai;
			}
			rata = jumlah / matkul;
			System.out.println("Rata-rata nilai mahasiswa ke-" + i + "= " + rata);
		}
		input.close();
	}

}
