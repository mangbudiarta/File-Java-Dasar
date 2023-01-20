package project_fungsi;

import java.util.Scanner;

public class VoidTukar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte A, B;

		System.out.print("Masukan nilai A sebelum ditukar = ");
		A = input.nextByte();

		System.out.print("Masukan nilai B sebelum ditukar = ");
		B = input.nextByte();

		Tukar(A, B);
		System.out.println("Nilai A setelah ditukar dalam main = " + A + " cm2");
		System.out.println("Nilai B setelah ditukar dalam main = " + B + " cm2");
		input.close();
	}

	static void Tukar(byte A, byte B) {
		byte temp;

		temp = A;
		A = B;
		B = temp;

		System.out.println("Nilai A setelah ditukar didalam fungsi = " + A + " cm2");
		System.out.println("Nilai b setelah ditukar didalam fungsi = " + B + " cm2");
	}

}
