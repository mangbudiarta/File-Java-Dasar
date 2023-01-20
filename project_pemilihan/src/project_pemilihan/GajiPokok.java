package project_pemilihan;

import java.util.Scanner;

public class GajiPokok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklrasai Variabel
		double gajiPokok, tunjangan, pajak,gajiBersih;
		Scanner input = new Scanner(System.in);
		
		//Deskripsi
		System.out.print("Masukan jumlah gaji pokok= ");
		gajiPokok = input.nextDouble();
		
		tunjangan = (20d/100d) * gajiPokok;
		
		if (gajiPokok > 5_000_000) {
			pajak = ((15d/100d) * (gajiPokok + tunjangan));
		}else {
			pajak = ((5d/100d) * (gajiPokok + tunjangan));
		}
		
		gajiBersih = gajiPokok + tunjangan - pajak;
		
		System.out.println("Jumlah gaji bersih yang anda terima= "+gajiBersih);
		input.close();
	}

}
