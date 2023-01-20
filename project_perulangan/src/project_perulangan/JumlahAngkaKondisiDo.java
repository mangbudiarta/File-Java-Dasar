package project_perulangan;

import java.util.Scanner;

public class JumlahAngkaKondisiDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte N,i;
		int jumlah;
		
		System.out.print("Masukan jumlah deret= ");
		N= input.nextByte();
		if(N>0) {
			jumlah = 0;
			i=1;
			do {
				jumlah = jumlah + i;
				i++;
			}
			while (i<=N);
			System.out.println("Jumlah angka= "+jumlah);
		}else {
			System.out.println("Masukan angka diatas 0");
		}
		input.close();
	}

}
