package Pertemuan_10;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa04 () {

    }

    Mahasiswa04 (String nm, String nim, String kls) {
        nama = nm;
        this.nim = nim;
        kelas = kls;
        nilai = -1;
    }

    void tugasDinilai (int nilai) {
        this.nilai = nilai; 
    }
}
