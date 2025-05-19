package Pertemuan_12;

public class Mahasiswa004 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa004 () {

    }

    Mahasiswa004 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi () {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
        
    }
}
