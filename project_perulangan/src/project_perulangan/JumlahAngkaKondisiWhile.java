package project_perulangan;

import java.util.Scanner;

public class JumlahAngkaKondisiWhile {

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
			while (i<=N) {
				jumlah = jumlah + i;
				i++;
			}
			System.out.println("Jumlah angka= "+jumlah);
		}else {
			System.out.println("Masukan angka diatas 0");
		}
		input.close();
	}

}
