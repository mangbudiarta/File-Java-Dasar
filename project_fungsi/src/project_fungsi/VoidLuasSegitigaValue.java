package project_fungsi;

import java.util.Scanner;

public class VoidLuasSegitigaValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		float a, t;
		System.out.print("Masukan nilai alas segitiga = ");
		a = input.nextFloat();

		System.out.print("Masukan nilai tinggi segitiga = ");
		t = input.nextFloat();

		HitungLuasSegitiga(a, t);

		input.close();

	}

	static void HitungLuasSegitiga(float a, float t) {
		float L;
		L = (a * t * (1f / 2f));
		System.out.println("Luas segitiga = " + L + " cm2");
	}

}
