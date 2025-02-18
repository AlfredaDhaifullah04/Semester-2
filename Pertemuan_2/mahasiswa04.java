package Pertemuan_2;

public class mahasiswa04 {
    // ATRIBUT
    String nama;
    String nim;
    String kelas;
    double ipk; 

    // MENTHOD
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
        System.out.println(nilaiKinerja());
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 0.0 && ipk <= 4.0) {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "kinerja kurang";
            }     
        } else {
            return "IPK tidak valid. Harus rentang 0.0 dan 4.0";
        }
    }

    // membuat konstruktor
    public mahasiswa04 () {
        
    }

    public mahasiswa04 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim; // "this" digunakan jika nama parameter sama dengan nama atribut
        this.ipk = ipk;
        kelas = kls;
    }

}

