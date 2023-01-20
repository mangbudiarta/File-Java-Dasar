package project_fungsi;

import java.util.Scanner;

public class SelisishDuaBuahJam {

	static int totalDetik1, totalDetik2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int j1jam, j1menit, j1detik, j2jam, j2menit, j2detik;
		// proses input nilaiJ1 dan J2
		System.out.print("Masukan waktu ke-1[Jam]= ");
		j2jam = input.nextInt();

		System.out.print("Masukan waktu ke-1[Menit]= ");
		j2menit = input.nextInt();

		System.out.print("Masukan waktu ke-1[detik]= ");
		j2detik = input.nextInt();

		System.out.print("Masukan waktu ke-2[Jam]= ");
		j1jam = input.nextInt();

		System.out.print("Masukan waktu ke-2[Menit]= ");
		j1menit = input.nextInt();

		System.out.print("Masukan waktu ke-2[detik]= ");
		j1detik = input.nextInt();

		// mengubah waktu ke detik untuk dibandingkan
		totalDetik1 = ((j2jam * 3600) + (j2menit * 60) + j2detik);
		totalDetik2 = ((j1jam * 3600) + (j1menit * 60) + j1detik);
		if (totalDetik1 > totalDetik2) {
			HitungSelisihJam(j1jam, j1menit, j1detik, j2jam, j2menit, j2detik);
		} else {
			System.out.println("Masukan waktu ke-1 lebih besar dari  waktu ke-2!!");
		}
		input.close();
	}

	static void HitungSelisihJam(int j1jam, int j1menit, int j1detik, int j2jam, int j2menit, int j2detik) {
		int totalDetik3, sisa, j3jam, j3menit, j3detik;

		totalDetik1 = ((j2jam * 3600) + (j2menit * 60) + j2detik);
		totalDetik2 = ((j1jam * 3600) + (j1menit * 60) + j1detik);
		totalDetik3 = totalDetik1 - totalDetik2;

		sisa = totalDetik3 % 3600;
		j3jam = totalDetik3 / 3600;
		j3menit = sisa / 60;
		j3detik = sisa % 60;

		System.out.println("Selisish waktu ke-1 dengan waktu ke-2");
		System.out.println(j3jam + " Jam");
		System.out.println(j3menit + " Menit");
		System.out.println(j3detik + " Detik");
	}

}
