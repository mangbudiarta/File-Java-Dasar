package project_perulangan;

import java.util.Scanner;

public class JumlahAngkaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		byte N,i;
		int jumlah;

		System.out.print("Masukan jumlah deret= ");
		N= input.nextByte();
		
		jumlah = 0;
		i=1;
		while (i<=N) {
			jumlah = jumlah + i;
			i++;
		}
		
		System.out.println("Jumlah angka= "+jumlah);
		input.close();
	}

}
