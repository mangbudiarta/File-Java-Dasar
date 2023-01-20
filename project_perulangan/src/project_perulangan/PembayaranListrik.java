package project_perulangan;

import java.util.Scanner;

public class PembayaranListrik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		final int biayaMaterai = 6000;
		final int biayaPerKwh = 1000;
		byte jenisPelanggan;
		int jumlahPemakaian,biayaAdmin;
		long totalBayar;
		
		do {
			System.out.print("Masukan jenis Pelanggan [1= Rumah Tangga 2= Bukan Rumah Tangga] = ");
			jenisPelanggan = input.nextByte();
		}while((jenisPelanggan != 1)  && (jenisPelanggan != 2));
		
		System.out.print("Masukan jumlah pemakaian listrik perbulan(Kwh)= ");
		jumlahPemakaian = input.nextInt();
		
		if (jenisPelanggan == 1) {
			biayaAdmin = 0;
		}else {
				biayaAdmin = 10000;
			}
		
		totalBayar = (biayaPerKwh *jumlahPemakaian) + biayaMaterai + biayaAdmin ;
		System.out.println("Total Biaya listrik yang harus dibayar= "+totalBayar);
		input.close();
	}

}
