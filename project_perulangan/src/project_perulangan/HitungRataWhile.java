package project_perulangan;

import java.util.Scanner;

public class HitungRataWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte N,i,angka;
		int jumlah;
		float rata;
		
		System.out.print("Masukan jumlah deret= ");
		N= input.nextByte();
		if(N>0) {
			jumlah = 0;
			i=1;
			while (i<=N){
				System.out.print("Masukan angka ke-"+i+"= ");
				angka= input.nextByte();
				jumlah = jumlah + angka;
				i++;
			}
			rata= (float)jumlah/N;
			System.out.println("Jumlah angka= "+jumlah);
			System.out.println("Nilai rata-rata= "+rata);
		}else {
			System.out.println("Masukan angka diatas 0");
		}
		input.close();
	}

}
