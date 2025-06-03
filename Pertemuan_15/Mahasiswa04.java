package Pertemuan_15;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04 () {

    }

    Mahasiswa04 (String nm, String nma, String kls, double ip) {
        nim = nm;
        nama = nma;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi () {
        System.out.println("NIM : " + nim +" "+
        "Nama : " +nama+" "+
        "Kelas : " + kelas+ " " +
        "IPK : " + ipk);
    }
}
