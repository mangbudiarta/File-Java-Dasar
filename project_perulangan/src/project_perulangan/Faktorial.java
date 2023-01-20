package project_perulangan;

import java.util.Scanner;

public class Faktorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i,total,faktorial;

		System.out.print("Masukan jumlah faktorial= ");
		faktorial= input.nextInt();
			total = 1;
			for (i = faktorial; i >= 1; i--) {
				total = i*total;
			}
			System.out.print(total);
		input.close();
	}

}
