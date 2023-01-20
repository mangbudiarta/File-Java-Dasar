package project_fungsi;

import java.util.Scanner;

public class VoidLuasSegitigaGlobal {
	static float a, t;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nilai alas segitiga = ");
		a = input.nextFloat();

		System.out.print("Masukan nilai tinggi segitiga = ");
		t = input.nextFloat();

		HitungLuasSegitiga();
		input.close();

	}

	static void HitungLuasSegitiga() {
		float L;
		
		L= a*t*(1f/2f);
		System.out.println("Luas segitiga = "+L+" com2");
	}
}
