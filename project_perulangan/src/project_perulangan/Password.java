package project_perulangan;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final String password = "12345";
		String sandi;
		Boolean valid;
		byte count;
		
		
		count = 1;
		valid = false;
		while ((!valid) && (count <= 3)) {
			System.out.print("Masukan sandi= ");
			sandi = input.nextLine();
			if (sandi.equals(password)) {
				valid = true;
				System.out.print("Selamat. Anda berhasil masuk");
			} else {
				count++;
			}
		}
		if (count > 3)
			System.out.print("Maaf, Anda sudah mencoba 3 kali");
		input.close();
	}
}
