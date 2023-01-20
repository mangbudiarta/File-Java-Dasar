package project_perulangan;

import java.util.Scanner;

public class PolaAngkaTerbalikWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Byte N,baris,kolom;
		
		System.out.print("Masukan jumlah Deret= ");
		N= input.nextByte();
		
		baris=1;
		while (baris<=N) {
			kolom=N;
			while( kolom>=baris) {
				System.out.print(kolom);
				kolom--;
			}
			baris++;
			System.out.println();
			input.close();
		}
	}

}
