package Pertemuan_6;

public class mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK  : " + ipk);
    }

    // konstruktor Defualt
    mahasiswa04 () {

    }

    // konstruktor berparameter
    mahasiswa04 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk =ip;
    }
}
