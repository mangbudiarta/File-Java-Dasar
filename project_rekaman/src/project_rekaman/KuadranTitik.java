package project_rekaman;

import java.util.Scanner;

public class KuadranTitik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte ax, ay;

		System.out.print("Masukan nilai x untuk titik A = ");
		ax = input.nextByte();

		System.out.print("Masukan nilai y untuk titik A = ");
		ay = input.nextByte();

		Titik titikA = new Titik(ax, ay);
		if ((titikA.x() > 0) && (titikA.y() > 0))
			System.out.print("Titik berada dikuadran I");
		else if ((titikA.x() < 0) && (titikA.y() > 0))
			System.out.print("Titik berada dikuadran II");
		else if ((titikA.x() < 0) && (titikA.y() < 0))
			System.out.print("Titik (" + ax + "," + ay + ") berada dikuadran III");
		else
			System.out.print("Titik berada dikuadran IV");

		input.close();
	}

}
