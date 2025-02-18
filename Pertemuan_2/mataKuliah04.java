package Pertemuan_2;

public class mataKuliah04 {
    // Atribut 
    String kodeMK;
    String nama; // nama matkul
    int sks;
    int jumlahJam;
    
    void tampilInformasi() {
        System.out.println("kode MatQul: " + kodeMK);
        System.out.println("Nama MatQul: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS (int newSKS) {
        sks = newSKS;
        System.out.println("SKS berhasil dirubah");
    }

    void tambahJam (int tambah) {
        jumlahJam += tambah;
    }
    
    void kurangiJam (int kurang) {
        if (kurang > jumlahJam) {
            System.out.println("pengurangan jam tidak dapat dilakukan karena jumlah pengurangan melebihi jumlah awal");
        } else {
            jumlahJam = (jumlahJam - kurang);
            System.out.println("jumlah jam saat ini: "+jumlahJam);
        }
    }

    // Membuat konstruktor
    public mataKuliah04 () {

    }

    public mataKuliah04(String kodeMatqul, String nama, int sks, int jumlahJam) {
        kodeMK = kodeMatqul;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
