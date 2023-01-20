package project_perulangan;

import java.util.Scanner;

public class JumlahDeretPecahan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float jumlah;
		int n, k, tanda;

		System.out.print("Masukan jumlah deret= ");
		n = input.nextInt();
		jumlah = 0f;
		k = 1;
		tanda = 1;
		
		while (k <= n) {
			jumlah = jumlah + (tanda * 1f / k);
			k = k + 2;
			tanda = -1 * tanda;

		}
		System.out.print("Jumlah deret= " + jumlah);
		input.close();
	}

}
