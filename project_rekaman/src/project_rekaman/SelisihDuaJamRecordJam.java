package project_rekaman;

import java.util.Scanner;

public class SelisihDuaJamRecordJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte jamJ1, menitJ1, detikJ1, jamJ2, menitJ2, detikJ2;
		int totalDetik1, totalDetik2;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Masukan nilai jam pertama = ");
			jamJ1 = input.nextByte();
			System.out.print("Masukan nilai menit pertama = ");
			menitJ1 = input.nextByte();
			System.out.print("Masukan nilai detik pertama = ");
			detikJ1 = input.nextByte();

			System.out.print("Masukan nilai jam kedua= ");
			jamJ2 = input.nextByte();
			System.out.print("Masukan nilai menit kedua = ");
			menitJ2 = input.nextByte();
			System.out.print("Masukan nilai detik kedua = ");
			detikJ2 = input.nextByte();

			Waktu J1 = new Waktu(jamJ1, menitJ1, detikJ1);
			Waktu J2 = new Waktu(jamJ2, menitJ2, detikJ2);

			totalDetik1 = (J1.jam() * 3600) + (J1.menit() * 60) + J1.detik();
			totalDetik2 = (J2.jam() * 3600) + (J2.menit() * 60) + J2.detik();
			if (totalDetik1 > totalDetik2) {
				System.out.println("Jam pertama lebih besar dari jam kedua!");
			} else {
				System.out.println("Jam pertama = " + J1.jam() + ":" + J1.menit() + ":" + J1.detik());
				System.out.println("Jam kedua = " + J2.jam() + ":" + J2.menit() + ":" + J2.detik());
			}
		} while (totalDetik1 > totalDetik2);
		hitungSelisihJam(totalDetik1, totalDetik2);
		input.close();
	}

	static void hitungSelisihJam(int T1, int T2) {
		int selisih = T2 - T1;
		int jam = selisih / 3600;
		int sisaDetik = selisih % 3600;
		int menit = sisaDetik / 60;
		int detik = sisaDetik % 60;
		System.out.println("Selisih Jam Pertama dengan Jam kedua = " + jam + ":" + menit + ":" + detik);
	}
}
