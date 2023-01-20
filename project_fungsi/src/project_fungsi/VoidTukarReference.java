package project_fungsi;

import java.util.Scanner;

class Tukar {
	byte A, B, temp;

	public Tukar(byte A, byte B) {
		this.A = A;
		this.B = B;
	}

	public void passReference(Tukar tukar) {
		temp = tukar.A;
		tukar.A = tukar.B;
		tukar.B = temp;
	}

	public void cetak(Tukar tukar) {
		System.out.println("Nilai A setelah ditukar dalam class = " + tukar.A + " cm2");
		System.out.println("Nilai B setelah ditukar dalam class = " + tukar.B + " cm2");
	}
}

public class VoidTukarReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte A, B;

		System.out.print("Masukan nilai A sebelum ditukar = ");
		A = input.nextByte();

		System.out.print("Masukan nilai B sebelum ditukar = ");
		B = input.nextByte();

		Tukar tukar = new Tukar(A, B);
		tukar.passReference(tukar);
		tukar.cetak(tukar);

		System.out.println("Nilai A setelah ditukar dalam main = " + tukar.A + " cm2");
		System.out.println("Nilai B setelah ditukar dalam main = " + tukar.B + " cm2");
		input.close();
	}

}
