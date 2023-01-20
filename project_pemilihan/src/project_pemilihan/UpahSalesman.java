package project_pemilihan;

import java.util.Scanner;

public class UpahSalesman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarasi Variabel
		Scanner input = new Scanner(System.in);
		float gajiPokok, bonus, total,satuan, upah;
		int jumlah;
		
		//Deklarasi variabel
		System.out.print("Masukan Gaji Pokok = ");
		gajiPokok = input.nextFloat();
		System.out.print("Masukan Jumlah Barang Terjual = ");
		jumlah = input.nextInt();
		System.out.print("Masukan Harga Satuan = ");
		satuan = input.nextFloat();
		
		total = jumlah * satuan;
		
		if (jumlah > 100) {
			bonus = (20f/100f)*total;
		}else {
			bonus = (10f/100f)*total;
		}
		
		upah = gajiPokok + bonus;
		
		System.out.println("Bonus yang diterima Salesman = "+ bonus);
		System.out.println("Total gaji yang diterima Salesman = "+ upah);
		input.close();
	}

}
