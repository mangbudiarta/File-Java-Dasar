package project_perulangan;

import java.util.Scanner;

public class JumlahAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		byte N,i;
		int jumlah;

		System.out.print("Masukan jumlah deret= ");
		N= input.nextByte();
		
		jumlah = 0;
		for (i=1; i<=N; i++) {
			jumlah = jumlah + i;
		
			}
		System.out.println("Jumlah angka= "+jumlah);
		input.close();
	}

}
