 package Pertemuan_1;

import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        int nTugas = 0, nKuis = 0, nUTS = 0, nUAS = 0; 

        // input nilai Mahasiswa
        System.out.print("Masukan nilai Tugas anda: ");
        nTugas = str.nextInt();
        System.out.print("Masukan nila Kuis anda: ");
        nKuis = str.nextInt();
        System.out.print("Masukan nilai UTS anda: ");
        nUTS = str.nextInt();
        System.out.print("Masukan nilai UAS anda: ");
        nUAS = str.nextInt();
        System.out.println("=========================");

        // melakukan validasi nilai yang diinputkan 
        if (nTugas  > 100|| nKuis > 100|| nUTS  > 100 || nUAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (nTugas * 0.2) + (nKuis *0.2) + (nUTS * 0.3) + (nUAS * 0.4);
    
            String kualifikasi = "";
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                kualifikasi = "Sangat baik (A)";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                kualifikasi = "Lebih dari baik (B+)";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                kualifikasi = "Baik (B)";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                kualifikasi = "Lebih dari Cukup (C+)";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                kualifikasi = "Cukup (C)";
            }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                kualifikasi = "Kurang (D)";
            } else if (nilaiAkhir <= 39 ) {
                kualifikasi = "Gagal (E)";
            }

            if (kualifikasi.equalsIgnoreCase("kurang (D)") || kualifikasi.equalsIgnoreCase("Gagal (E)")) {
                System.out.println("Nilai akhir : " + nilaiAkhir);
                System.out.println("Nilai huruf : " + kualifikasi);
                System.out.println("=======================");
                System.out.println("MAAF, ANDA TIDAK LULUS");
            } else {
                System.out.println("Nilai akhir : " + nilaiAkhir);
                System.out.println("Nilai huruf : " + kualifikasi);
                System.out.println("==========================");
                System.out.println("SELAMAT ANDA LULUS");
            }
    

        }

    }
}