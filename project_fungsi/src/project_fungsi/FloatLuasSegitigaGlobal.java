package project_fungsi;

import java.util.Scanner;

public class FloatLuasSegitigaGlobal {
	static float a, t, L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nilai alas segitiga = ");
		a = input.nextFloat();

		System.out.print("Masukan nilai tinggi segitiga = ");
		t = input.nextFloat();
		L = HitungLuasSegitiga();
		System.out.println("Luas segitiga = " + L + " cm2");
		input.close();
	}

	static float HitungLuasSegitiga() {
		return (a * t * (1f / 2f));
	}

}
