package project_perulangan;

import java.util.Scanner;

public class CetakAngkaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte N,i;
		
		
		System.out.print("Masukan jumlah detret = ");
		N = input.nextByte();

		for(i=1; i<=N; i++) {
			System.out.println(i);
		}
		input.close();
	}

}
