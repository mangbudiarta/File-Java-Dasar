package project_perulangan;

import java.util.Scanner;

public class DeretPositif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float angka, jumlah;
		byte i,pangkat;
		
		System.out.print("Masukan angka= ");
		angka = input.nextByte();
		System.out.print("Masukan pangkat= ");
		pangkat = input.nextByte();
		jumlah=1;
		input.close();
		for (i = 1; i <= Math.abs(pangkat); i++) {
				jumlah = angka * jumlah;
			}
		if (pangkat<0)
			jumlah = 1/jumlah;
			
			System.out.print("jumlah " + angka + " pangkat " + pangkat + " adalah " + jumlah);
	}

}
