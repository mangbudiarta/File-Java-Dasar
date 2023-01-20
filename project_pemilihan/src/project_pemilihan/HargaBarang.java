package project_pemilihan;

import java.util.Scanner;

public class HargaBarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarassi Variabel
		Scanner input = new Scanner(System.in);
		int jumlahBarang;
		float hargaBarang, total, diskon,bayar;
		
		System.out.print("masukan harga barang= ");
		hargaBarang = input.nextFloat();
		System.out.print("masukan jumlah barang= ");
		jumlahBarang = input.nextInt();
		
		total = hargaBarang * jumlahBarang;
		if (jumlahBarang > 100) {
			diskon = (10f/100f) * total;
		}else {
			diskon = (5f/100f) * total;
		}
		bayar = total - diskon;
		System.out.println("harga sebelum diskon= "+total);
		System.out.println("diskon= "+diskon);
		System.out.println("harga sesudah diskon= "+bayar);
		
		input.close();
	}
	

}
