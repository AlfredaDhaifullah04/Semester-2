package Pertemuan_8;
import java.util.Scanner;

public class DataSiakad {
    Scanner sc = new Scanner(System.in);

    // array of object mahasiswa
    mahasiswa [] mhsArr = new mahasiswa[3];
    // array of object mata kuliah
    MataKuliah [] mkArr = new MataKuliah[3];
    // array of object penilaian 
    Penilaian [] penArr = new Penilaian [5];

    // menyimpan data pada 
    DataSiakad () {
        mhsArr[0] = new mahasiswa("22001","Ali Rahman" , "Informatika");
        mhsArr[1] = new mahasiswa("22002", "Budi Santoso", "Informatika");
        mhsArr[2] = new mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bissin");

        mkArr [0] = new MataKuliah("MK001", "Struktur Data", 3);
        mkArr [1] = new MataKuliah("MK002", "Basis Data", 3);
        mkArr [2] = new MataKuliah("MK003", "Desain Web", 3);

        penArr[0] = new Penilaian(mhsArr[0], mkArr[0], 80, 85, 90);
        penArr[1] = new Penilaian(mhsArr[0], mkArr[1], 60, 75, 70);
        penArr[2] = new Penilaian(mhsArr[1], mkArr[0], 75, 70, 80);
        penArr[3] = new Penilaian(mhsArr[2], mkArr[1], 85, 90, 95);
        penArr[4] = new Penilaian(mhsArr[2], mkArr[2], 80, 90, 65);
    }

    // method untuk menampilkan daftar mahasiswa
    void tampilDataMHS () {
        System.out.println("===== Data Mahasiswa =====");
        for (int i = 0; i < mhsArr.length; i++) {
            mhsArr[i].tampilMahasiswa();
        }
    }

    // method untuk menampilkan daftar mata kuliah 
    void tampilDataMK () {
        System.out.println("===== Data Mata =====");
        for (int i = 0; i < penArr.length; i++) {
            mkArr[i].tampilMK();
        }
    }

    // method untuk menampilkan data penilaian
    void tampilDataPenilaian () { 
        System.out.println("===== Data Penilaian =====");
        for (int i = 0; i < penArr.length; i++) { 
            penArr[i].hitungNilaiAkhir();
            penArr[i].tampilPenilaian();
        }
    }

    // pengurutan data mahasiswa berdasarkan Nilai Akhir
    void urutanDataMHS () {
        for (int i = 0; i < penArr.length - 1; i++) {
            for (int j = 0; j < penArr.length - 1 - i; j++) {
                penArr[i].hitungNilaiAkhir();
                penArr[i+1].hitungNilaiAkhir();
                if (penArr[j].nilaiAKHIR < penArr[j+1].nilaiAKHIR) { 
                    Penilaian temp = penArr[j];
                    penArr[j] = penArr[j+1];
                    penArr[j+1] = temp;
                }
            }
        }
        tampilDataPenilaian();
    }

    // method untuk mencari mahasiswa berdasarkan nilai akhir
    void cariMahasiswa () {
        System.out.print("Masukan nilai mahasiswa yagn ingin dicari: ");
        String cariNIM = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < mhsArr.length; i++) { 
            if (mhsArr[i].equals(cariNIM)) {
                System.out.println("Data ditemukan, NIM: " + mhsArr[i].nim+ " | Nama : " + mhsArr[i].nama+" | Prodi : " + mhsArr[i].prodi);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Data MAhasiswa dengan nim "+ cariNIM +"tidak ditemukan");
        }    
    }
}
