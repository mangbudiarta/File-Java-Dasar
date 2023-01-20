package project_rekaman;

public class RekamanMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mengisi data rekaman
		Mahasiswa mhs = new Mahasiswa("2115354005", "Budi", 90f);

		// mencetak data rekaman
		System.out.println("NIM : " + mhs.nim());
		System.out.println("Nama : " + mhs.nama());
		System.out.println("Nilai : " + mhs.nilai());
		System.out.println(mhs.toString());
//		System.out.println(mhs.hashCode());
//		System.out.println(mhs.equals(args));
	}

}
