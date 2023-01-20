package project_pemilihan;
import java.util.Scanner;
public class NamaBulanIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte nomorBulan;
		
		System.out.print("Masukan Nomor Bulan = ");
		nomorBulan = input.nextByte();
		if (nomorBulan == 1) {
			System.out.println("Januari");
		}else if (nomorBulan == 2) {
			System.out.println("Februari");
		}else if (nomorBulan == 3) {
			System.out.println("Maret");
		}else if (nomorBulan == 4) {
			System.out.println("April");
		}else if (nomorBulan == 5) {
			System.out.println("Mei");
		}else if (nomorBulan == 6) {
			System.out.println("Juni");
		}else if (nomorBulan == 7) {
			System.out.println("Juli");
		}else if (nomorBulan == 8) {
			System.out.println("Agustus");
		}else if (nomorBulan == 9) {
			System.out.println("September");
		}else if (nomorBulan == 10 ) {
			System.out.println("Oktober");
		}else if (nomorBulan == 11) {
			System.out.println("November");
		}else if (nomorBulan == 12) {
			System.out.println("Desember");
		}else {
			System.out.println("Nomor bulan antara 1-12!");
		}
		input.close();
	}

}
