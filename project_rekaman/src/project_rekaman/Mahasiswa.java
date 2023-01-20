package project_rekaman;

public record Mahasiswa(String nim, String nama, float nilai) {
//	public void ubahData(float nilai) {
//		this.nilai = nilai; /*error final mahasiswa cannot be assigned - nilai pada record mahasiswa tidak dapat diubah nilainya*/
//	}

}
