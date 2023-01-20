package project_fungsi;

import java.util.Scanner;

public class SelisihDuaBuahJamVersiDosen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte j1jam, j1menit, j1detik, j2jam, j2menit, j2detik;
		int totalDetik1, totalDetik2;
		do {
			// proses input nilaiJ1 dan J2
			System.out.print("Masukan waktu ke-1[Jam]= ");
			j1jam = input.nextByte();

			System.out.print("Masukan waktu ke-1[Menit]= ");
			j1menit = input.nextByte();

			System.out.print("Masukan waktu ke-1[detik]= ");
			j1detik = input.nextByte();

			System.out.print("Masukan waktu ke-2[Jam]= ");
			j2jam = input.nextByte();

			System.out.print("Masukan waktu ke-2[Menit]= ");
			j2menit = input.nextByte();

			System.out.print("Masukan waktu ke-2[detik]= ");
			j2detik = input.nextByte();

			// mengubah waktu ke detik untuk dibandingkan
			totalDetik1 = ((j2jam * 3600) + (j2menit * 60) + j2detik);
			totalDetik2 = ((j1jam * 3600) + (j1menit * 60) + j1detik);
			if ((totalDetik1 < totalDetik2) || (totalDetik1 == totalDetik2)) {
				System.out.println("Masukan waktu ke-1 lebih besar dari waktu ke-2!!");
			} else {
				System.out.println("Jam Pertama = " + j2jam + " jam " + j2menit + " menit " + j2detik + " detik ");
				System.out.println("Jam Kedua = " + j1jam + " jam " + j1menit + " menit " + j1detik + " detik ");
				HitungSelisihJam(totalDetik1, totalDetik2);
				input.close();
			}
		} while ((totalDetik1 < totalDetik2) || (totalDetik1 == totalDetik2));

	}

	static void HitungSelisihJam(int totalDetik1, int totalDetik2) {
		int selisih, sisa, j3jam, j3menit, j3detik;
		selisih = totalDetik1 - totalDetik2;
		sisa = selisih % 3600;
		j3jam = selisih / 3600;
		j3menit = sisa / 60;
		j3detik = sisa % 60;

		System.out.println("Selisish waktu ke-1 dengan waktu ke-2 = " + j3jam + " Jam " + j3menit + " Menit " + j3detik
				+ " Detik");
	}

}
