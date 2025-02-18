package Pertemuan_2;

public class mataKuliahMain04 {
    public static void main(String[] args) {
        
        mataKuliah04 matkul1 = new mataKuliah04();
        matkul1.kodeMK = "3A19";
        matkul1.nama = "Praktikum Basis Data";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;

        // matkul1.tampilInformasi();
        // matkul1.ubahSKS(5);
        // matkul1.kurangiJam(2);
        // matkul1.tampilInformasi();

        mataKuliah04 matkul2 = new mataKuliah04("4B12", "Algoritma dan Struktur Data", 4, 5);
        
        matkul2.tampilInformasi();
        matkul2.ubahSKS(5);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();
    }
}
