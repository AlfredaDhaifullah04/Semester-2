package Pertemuan_3;

public class Dosen4 {

    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;

    public  Dosen4 (String kde, String nma, String gender, int umur) {
        kode = kde;
        nama = nma;
        jenisKelamin = gender;
        usia = umur;

    }

    void showDataDosen() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }
}
