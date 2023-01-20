package project_fungsi;

import java.util.Scanner;

public class FloatLuasSegitigaValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float a,t;
		System.out.print("Masukan nilai alas segitiga = ");
		a = input.nextFloat();

		System.out.print("Masukan nilai tinggi segitiga = ");
		t = input.nextFloat();
		
		System.out.println("Luas segitiga = " + HitungLuasSegitiga(a, t) + " cm2");
		input.close();
	}
	static float HitungLuasSegitiga(float a, float t) {
		return(a * t * (1f / 2f));
	}

}
