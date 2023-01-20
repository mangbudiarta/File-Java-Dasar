package project_perulangan;

import java.util.Scanner;

public class DeretsegitigaAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Byte N,baris,kolom;
		
		System.out.print("Masukan jumlah Deret= ");
		N= input.nextByte();
		
		for (baris=1; baris<=N; baris++) {
			for(kolom=1; kolom<=baris; kolom++) {
				System.out.print(kolom);
			}
			System.out.println();
		}
	}

}
