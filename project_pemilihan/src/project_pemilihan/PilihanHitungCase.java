package project_pemilihan;

import java.util.Scanner;

public class PilihanHitungCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float luas, keliling, panjang, lebar;
		byte pilihan;
		
		System.out.print("Masukan panjang = ");
		panjang = input.nextFloat();
		System.out.print("Masukan lebar = ");
		lebar = input.nextFloat();
		System.out.println("MENU");
		System.out.println("--------------------------------");
		System.out.println("1 Luas Empat Persegi Panjang");
		System.out.println("2 Keliling Empat Persegi Panjang");
		System.out.println("3 Keluar Program");
		System.out.print("Masukan pilihan Anda [1/2/3] = ");
		pilihan = input.nextByte();
	
		
		switch(pilihan ) {
		case 1:	{
			System.out.println("Luas Empat Persegi Panjang");
			luas = panjang * lebar;
			System.out.println("Persegi panjang dengan panjang "+panjang+" cm dan lebar "+lebar+" cm memiliki Luas  = "+luas+" cm2");
			break;
		}
				
		case 2: {
			System.out.println("Keliling Empat Persegi Panjang");
			keliling = 2 * (panjang + lebar);
			System.out.println("Persegi panjang dengan panjang "+panjang+" cm dan lebar "+lebar+" cm memiliki Keliling  = "+keliling+" cm");
			break;
		}
				
		default: System.out.println("Keluar Program");
		}
		input.close();

	}

}
