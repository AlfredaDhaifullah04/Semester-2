package Pertemuan_3;

public class MataKuliah4 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    // konstruktor berparameter
    public MataKuliah4(String kode, String nama, int sks, int jumlahsks){ 
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahjam = jumlahsks;
    }

    // konstruktor 1 parameter
    public  MataKuliah4(String nama) {
        this.kode = "Tidak diketahui";
        this.nama = nama;
        this.sks = 0;
        jumlahjam = 0;
    } 

    // menthod
    void spillData() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam : " + jumlahjam);
        System.out.println("------------------------------------");
    }

    void tambahData (String kde, String nma, int sks, int jumjam) {
        kode = kde;
        nama = nma;
        this.sks = sks;
        jumlahjam = jumjam;
    }
}
