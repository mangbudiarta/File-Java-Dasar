package project_pemilihan;

import java.util.Scanner;

public class CicilanRumah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final float bungaPerTahun  = 0.14f;
		float hargaRumah,dp,sisaHutang,pokokHutang,bungaperBulan,besarCicilan;
		byte lamaCicil;
		
		System.out.print("masukan harga rumah = ");
		hargaRumah =input.nextFloat();
		System.out.print("masukan lama mencicil = ");
		lamaCicil =input.nextByte();
		
		if ((lamaCicil > 0) && (lamaCicil<= 5)) {
			dp = (10f/100f);
		}else if (lamaCicil < 0) {
			dp = 0f;
		}
		else {
			dp =(30f/100f);
		}
		
		if (dp != 0) {
		sisaHutang = hargaRumah -(dp * hargaRumah);
		pokokHutang = sisaHutang/(lamaCicil *12);
		bungaperBulan = sisaHutang *(bungaPerTahun/12);
		besarCicilan = pokokHutang+ bungaperBulan;
		
		System.out.println("Besar cicilan yang harus anda bayar = "+besarCicilan);
		}else {
			System.out.println("Masukan lama mencicil diatas 0");
		}
		input.close();

	}

}
