package project_pemilihan;
import java.util.Scanner;
public class GenapGanjil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklarassi Variabel
		int bil;
		Scanner input = new Scanner(System.in);
		
		//Deskripsi
		System.out.print("masukan angka= ");
		bil = input.nextInt();
		if (bil % 2 == 0) {
			System.out.println(bil+" adalah bilangan genap");
		}else {
			System.out.println(bil+" adalah bilangan ganjil");
		}
		input.close();
		}

}
