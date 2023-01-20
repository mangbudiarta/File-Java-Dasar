package project_rekaman;

import java.util.Scanner;

public class KordinatKartesian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte ax, ay, bx, by;
		double jarak;

		System.out.print("Masukan nilai x untuk titik A = ");
		ax = input.nextByte();

		System.out.print("Masukan nilai y untuk titik A = ");
		ay = input.nextByte();

		System.out.print("Masukan nilai x untuk titik B = ");
		bx = input.nextByte();

		System.out.print("Masukan nilai y untuk titik B = ");
		by = input.nextByte();

		Titik titikA = new Titik(ax, ay);
		Titik titikB = new Titik(bx, by);

		jarak = Math.sqrt(Math.pow((titikB.x() - titikA.x()), 2) + Math.pow((titikB.y() - titikA.y()), 2));
		System.out.println("Jarak kedua titik = " + String.format("%.2f", jarak));
		input.close();

	}

}
