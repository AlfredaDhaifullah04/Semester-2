package Pertemuan_8;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah (String kodeMatkul,String namaMatkul, int sKS) {
        kodeMK = kodeMatkul;
        namaMK = namaMatkul;
        sks = sKS;

    }

    void tampilMK () {
        System.out.println("Kode MK: " + kodeMK+ "| Nama: " + namaMK+ "| sks: " +sks);
    }
}
