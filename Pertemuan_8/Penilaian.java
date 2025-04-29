package Pertemuan_8;

public class Penilaian {
    mahasiswa MHS;
    MataKuliah MK;

    double nilaiTGS;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAKHIR;

    Penilaian (mahasiswa mhs, MataKuliah mk, double tgs, double uts, double uas) {
        MHS = mhs;
        MK = mk;
        nilaiTGS = tgs;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    void hitungNilaiAkhir() { 
        nilaiAKHIR = ((0.3 * nilaiTGS) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS)) / 3;
    }

    void tampilPenilaian () {
        System.out.println("NIM: " + MHS.nim + " | " + "Nama: " + MHS.nama + " | " + "Matakuliah: " + MK.namaMK + " | " + "Nilai Akhir: " + nilaiAKHIR);       
    }
}
