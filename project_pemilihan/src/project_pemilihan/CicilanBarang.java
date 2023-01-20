package project_pemilihan;

import java.util.Scanner;

public class CicilanBarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarasi Variabel
		Scanner input = new Scanner(System.in);
		float harga, pokokHutang, bayar,cicilan;
		final float diskon = (10f/100f);
		final float bunga = (2f/100f);
		byte pilihan, waktu;
		
		//Deskripsi
		System.out.print("masukan harga barang= ");
		harga =input.nextFloat();
		System.out.println("pilihan pembayaran 1 = tunai 2= kredit");
		System.out.print("Masukan pilihan pembayaran[1/2]= ");
		pilihan =input.nextByte();
		
		if (pilihan == 1) {
			bayar = harga - (diskon * harga);
			System.out.print("Anda harus membaya tunai sebesar Rp.= "+bayar);
		}else if (pilihan == 2) {
			System.out.print("Masukan waktu mencicil(bulan)= ");
			waktu =input.nextByte();
			pokokHutang = harga / waktu;
			cicilan = (bunga * harga )+ pokokHutang;
			System.out.print("Anda harus membayar cicilan sebesar Rp. "+cicilan);
		}else {
			System.out.print("Masukan pilihan 1 atau 2");
		}
		
		input.close();
	}

}
