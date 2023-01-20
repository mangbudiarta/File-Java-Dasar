package project_pemilihan;

import java.util.Scanner;

public class IndeksNilai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float nilai;
		char indeks;
		System.out.print("masukan nilai mahasiswa= ");
		nilai = input.nextFloat();
		
		if (nilai >= 80 && nilai <=100) {
			indeks ='A';
		}else if (nilai >= 70 && nilai <80) {
			indeks ='B';
		}else if (nilai >= 55 && nilai <70) {
			indeks ='C';
		}else if (nilai >= 40 && nilai <55) {
			indeks ='D';
		}else if (nilai >=0 && nilai < 40) {
			indeks ='E';
		}else {
			indeks ='0';
			
		}
		
		if (indeks ==  '0') 
			System.out.println("Masukan nilai 0-100!");
		else
		System.out.println("Mahasiswa dengan nilai " +nilai+ " mendapat indeks "+indeks);
		input.close();
	}

}
