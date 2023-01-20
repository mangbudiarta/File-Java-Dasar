package project_fungsi;

import java.util.Scanner;

public class VoidLuasSegitigaLokal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HitungLuasSegitiga();

	}

	static void HitungLuasSegitiga() {
		Scanner input = new Scanner(System.in);

		float a, t, L;
		System.out.print("Masukan nilai alas segitiga = ");
		a = input.nextFloat();

		System.out.print("Masukan nilai tinggi segitiga = ");
		t = input.nextFloat();
		
		L = (a * t * (1f / 2f));
		System.out.println("Luas segitiga = " + L + " cm2");
		input.close();
	}

}
