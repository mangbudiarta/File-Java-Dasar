package project_perulangan;

import java.util.Scanner;

public class JumlahAngkaDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		byte N,i;
		int jumlah;

		System.out.print("Masukan jumlah deret= ");
		N= input.nextByte();
		
		jumlah = 0;
		i=1;
		do {
			jumlah = jumlah + i;
			i++;
		}
		while (i<=N);
		
		System.out.println("Jumlah angka= "+jumlah);
		input.close();
	}

}
