package project_pemilihan;
import java.util.Scanner;
public class BilanganTerbesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarassi Variabel
		int maks,bil1,bil2;
		Scanner input = new Scanner(System.in);
		
		//Deskripsi
		System.out.print("masukan angka pertama= ");
		bil1 = input.nextInt();
		System.out.print("masukan angka kedua= ");
		bil2 = input.nextInt();
		if (bil1 > bil2) {
			System.out.println("bilangan terbesar antara "+bil1+ " dengan "+bil2+" adalah "+bil1);
		}else {
			System.out.println("bilangan terbesar antara "+bil1+ " dengan "+bil2+" adalah "+bil2);
		}
		
		//cara2
		if (bil1 > bil2) {
			maks = bil1;
		}else {
			maks = bil2;
		}
		System.out.println("bilangan terbesar antara "+bil1+ " dengan "+bil2+" adalah "+maks);
		
		//cara operator
		maks =(bil1>bil2)?bil1:bil2;
		System.out.println("bilangan terbesar antara "+bil1+ " dengan "+bil2+" adalah "+maks);
		input.close();
		}

}
