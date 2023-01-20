package project_perulangan;

import java.util.Scanner;

public class JumlahGenapDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte banyakBilangan, i;
		int bilangan;
		long totalBilangan;

		do {
			System.out.print("masukan banyak bilangan = ");
			banyakBilangan = input.nextByte();
			if (banyakBilangan > 0) {
				totalBilangan = 0;
				i = 1;
				while (i <= banyakBilangan) {
					System.out.print("Masukan bilngan ke-" + i + "= ");
					bilangan = input.nextInt();
					if (bilangan % 2 == 0)
						totalBilangan = totalBilangan + bilangan;
					i++;

				}
				System.out.println("jumlah nilai bernilai genap =" + totalBilangan);
			} else
				System.out.println("Banyak bilangan harus lebih besar dari 0!");
		} while (banyakBilangan <= 0);
		input.close();

	}

}
