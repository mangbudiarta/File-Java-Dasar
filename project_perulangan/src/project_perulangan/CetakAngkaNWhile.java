package project_perulangan;

import java.util.Scanner;

public class CetakAngkaNWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte N,i;
		
		System.out.print("Masukan jumlah deret= ");
		N = input.nextByte();
		
		i = 1;
		while (i<=N) {
			System.out.println(i);
			i++;
		}
		input.close();
	}

}
