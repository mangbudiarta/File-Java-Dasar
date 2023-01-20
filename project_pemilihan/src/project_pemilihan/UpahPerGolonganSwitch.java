package project_pemilihan;

import java.util.Scanner;

public class UpahPerGolonganSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final float upahLembur= 3000;
		int jamKerja, jamLembur;
		char golongan;
		float upahPerJam, gaji;
		
		System.out.print("masukan jumlah jam kerja= ");
		jamKerja =input.nextInt();
		System.out.print("masukan golongan anda[A-D]= ");
		golongan =input.next().charAt(0);
		
		switch (Character.toUpperCase(golongan)){
		case 'A': upahPerJam = 4000f;break;
		case 'B': upahPerJam = 5000f;break;
		case 'C': upahPerJam = 6000f;break;
		case 'D': upahPerJam = 7000f;break;
		default : upahPerJam = 0f;System.out.println("Masukan golongan A-D!");
		}

		if (jamKerja > 48 && upahPerJam !=0f) {
			jamLembur = jamKerja - 48;
			gaji = (upahLembur * jamLembur) + (48 * upahPerJam);
			System.out.print("Karyawan golongan "+ Character.toUpperCase(golongan)+" Upah yang anda terima  sebesar Rp. "+gaji);
		}else if (jamKerja > 0 && upahPerJam !=0f) {
			gaji = (jamKerja * upahPerJam);
			System.out.print("Karyawan golongan "+ Character.toUpperCase(golongan)+" Upah yang anda terima  sebesar Rp. "+gaji);
		}else {
			System.out.print("Tidak menghitung upah karena input tidak valid");
		}
		input.close();
	}
	

}
