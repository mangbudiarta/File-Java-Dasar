package project_rekaman;

import java.util.Scanner;

public class TransaksiPenjualan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Barang[] beli = new Barang[100];
		byte i, jumlah;
		String tipe;
		float harga, diskon, subTotal, total, bayar;
		char ulang;

		i = 0;
		total = 0;
		do {
			System.out.print("Masukan jumlah barang yang dibeli = ");
			jumlah = input.nextByte();
			System.out.print("Masukan harga barang yang dibeli = Rp. ");
			harga = input.nextFloat();
			subTotal = harga * jumlah;
			beli[i] = new Barang(jumlah, harga, subTotal);
			total += subTotal;
			i++;
			System.out.print("Apakah anda mau mengulang hitung lagi ?[Y/T]");
			ulang = input.next().charAt(0);
		} while (Character.toUpperCase(ulang) == 'Y');
		
		if (Character.toUpperCase(ulang) != 'Y')
			System.out.println("Anda memilih berhenti mengulang");
		input.nextLine();
		do {
			System.out.print("Masuan tipe pelanggan (Anggota atau Umum) = ");
			tipe = input.nextLine();
			if (tipe.toLowerCase().equals("anggota")) {
				diskon = 0.10f * total;
			} else if (tipe.toLowerCase().equals("umum")) {
				diskon = 0.05f * total;
			} else {
				diskon = 0.0f;
				System.out.println("Tipe hanya umum dan anggota, coba input ulang!!");
			}
		} while ((!tipe.toLowerCase().equals("anggota")) && (!tipe.toLowerCase().equals("umum")));
		bayar = total - diskon;
		System.out.println("Transaksi Pembelian:");
		for (byte j = 0; j < i; j++) {
			System.out.println("Barang ke- : " + (j + 1));
			System.out.println("Jumlah           = " + beli[j].jumlah());
			System.out.println("Harga            = Rp. " + beli[j].harga());
			System.out.println("Sub Total        = Rp. " + beli[j].subTotal());
		}
		System.out.println("TOTAL TRANSAKSI : ");
		System.out.println("Total       = Rp.  " + total);
		System.out.println("Diskon      = Rp.  " + diskon);
		System.out.println("Bayar       = Rp.  " + bayar);
		input.close();

	}

}
