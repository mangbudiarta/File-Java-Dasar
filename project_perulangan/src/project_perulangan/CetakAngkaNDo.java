package project_perulangan;

import java.util.Scanner;

public class CetakAngkaNDo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte N,i;
		
		System.out.print("Masukan jumlah deret= ");
		N = input.nextByte();
		
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=N) ;
		input.close();
	}

}
