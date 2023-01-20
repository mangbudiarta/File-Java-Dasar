package project_pemilihan;

import java.util.Scanner;

public class SewaKendaraan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int biayaAdmin = 10000;
		String jenisKendaraan;
		byte noMenu, lamaSewa=0;
		long sewaHarian, biayaDeposit, totalBiaya;

		do {
			System.out.println("MENU");
			System.out.println("1.Sewa Motor");
			System.out.println("2. Sewa Mobil SUV");
			System.out.println("3. Sewa Mobil MPV");
			System.out.println("4. Keluar Program");
			
			System.out.print("Masukan pilihan anda(1/2/3/4)= ");
			noMenu = input.nextByte();

			if (noMenu == 4) {
				System.out.println("Anda memilih Keluar Program");
			} else if ((noMenu < 1) || (noMenu > 4)) {
				System.out.println("Pilihan Anda salah!!!");
			} else {
				do {
					System.out.print("Masukan lama Menyewa dalamhari maksimal 30 hari= ");
					lamaSewa = input.nextByte();
					if (lamaSewa > 30) 
						System.out.println("Jumlah hari tidak boleh lebih dari 30. Silahkan input kembali!!!");
					
				} while (lamaSewa >30);
			
			switch (noMenu) {
			case 1: {
				jenisKendaraan= "Motor";
				sewaHarian = 100000L;
				biayaDeposit = 100000L;
				break;
			}
			case 2: {
				jenisKendaraan= "Mobil SUV";
				sewaHarian = 300000L;
				biayaDeposit = 150000L;
				break;
			}
			case 3: {
				jenisKendaraan= "Mobil MPV";
				sewaHarian = 500000L;
				biayaDeposit = 250000L;
				break;
			}
			default: {
				jenisKendaraan= " ";
				sewaHarian = 0L;
				biayaDeposit = 0L;
			}

			}
			totalBiaya = (biayaAdmin + (sewaHarian + biayaDeposit) * lamaSewa);
			System.out.println("Jenis kendaraan= " + jenisKendaraan);
			System.out.println("Lama Sewa= " + lamaSewa);
			System.out.println("Biaya Admin= " + biayaAdmin);
			System.out.println("sewa Hariann= " + sewaHarian);
			System.out.println("biaya Deposit= " + biayaDeposit);
			System.out.println("total Biaya= " + totalBiaya);
		} 
		}
	while (noMenu != 4);
		input.close();
	}

}
