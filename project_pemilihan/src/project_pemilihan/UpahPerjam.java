package project_pemilihan;
import java.util.Scanner;
public class UpahPerjam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Deklarasi Variabel
		Scanner input = new Scanner(System.in);
		final int upahLembur = 3000;
		final int upahPerJam = 20000;
		int jam, waktuLembur;
		long lembur,gaji;
		
		//Deskripsi
		System.out.print("masukan jam kerja= ");
		jam = input.nextInt();
		if (jam > 48) {
			waktuLembur = jam - 48;
			lembur = waktuLembur * upahLembur;
			gaji = (48 * 20000)+lembur;
		} else {
			gaji = (jam * upahPerJam);
		}
		System.out.print("Besar gaji yang anda terima= "+gaji);
		input.close();
	}

}
