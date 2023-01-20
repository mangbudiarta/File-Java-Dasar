package project_perulangan;

import java.util.Scanner;

public class PilihanMenuHitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte pilihan;

		do {
			System.out.println("MENU");
			System.out.println("----------------------");
			System.out.println("1. Baca Data");
			System.out.println("2. Cetak Data");
			System.out.println("3. Ubah Data");
			System.out.println("4. Hapus Data");
			System.out.println("5. Keluar Program");
			System.out.println("----------------------");

			System.out.print("Masukan nomor pilihan = ");
			pilihan = input.nextByte();
			switch (pilihan) {
			case 1:
				System.out.println("Anda memilih menu Baca Data");
				break;
			case 2:
				System.out.println("Anda memilih menu Cetak Data");
				break;
			case 3:
				System.out.println("Anda memilih menu Ubah Data");
				break;
			case 4:
				System.out.println("Anda memilih menu Hapus Data");
				break;
			case 5:
				System.out.println("Anda memilih menu keluar program");
				break;
			default:
				System.out.println("Nomor yang anda inputkan salah!");
			}
		} while (pilihan != 1 && pilihan != 2 && pilihan != 3 && pilihan != 4 && pilihan != 5);
		input.close();
	}

}
