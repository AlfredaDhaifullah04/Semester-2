package Pertemuan_1;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);

        System.out.print("Berapa banyak mata kuliah yang diambil? :");
        int jmlMK = str.nextInt(); str.nextLine();
        System.out.println("===================================");
        
        // Deklarasi array untuk menyimpan nama mata kuliah
        String namaMK [] = new String[jmlMK];
        int bobotSKS[] = new int[jmlMK];
        // mengisi nama Mata Kuliah
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Nama mata kuliah yang anda ambil? :");
            namaMK[i] = str.nextLine();
            System.out.print("Berapa bobot SKS?: ");
            bobotSKS[i] = str.nextInt();str.nextLine();
        }

        // deklarasi sekaligus input nilai mahasiswa
        int nilaiMHS[] = new int[jmlMK]; 
        for (int i = 0; i < nilaiMHS.length;i++) {
            System.out.print("Masukan Nilai pada MK " + namaMK[i] +": ");
            nilaiMHS[i] = str.nextInt();str.nextLine();
        }

        // Menentukan kualifikasi nilai Huruf dan juga Bobot nilai
        String kualifikasi[] = new String[jmlMK];
        double bobotNilai[] = new double[jmlMK];
        
        for (int i = 0; i < kualifikasi.length; i++) {
            if (nilaiMHS[i] > 80 && nilaiMHS[i] <= 100) {
                kualifikasi[i] = "(A)";
                bobotNilai[i] = 4.00;
            } else if (nilaiMHS[i] > 73 && nilaiMHS[i] <= 80) {
                kualifikasi[i] = "(B+)";
                bobotNilai[i] = 3.50;
            } else if (nilaiMHS[i] > 65 && nilaiMHS[i] <= 73) {
                kualifikasi[i] = "(B)";
                bobotNilai[i] = 3.00;
            } else if (nilaiMHS[i] > 60 && nilaiMHS[i] <= 65) {
                kualifikasi[i] = "(C+)";
                bobotNilai[i] = 2.50;
            } else if (nilaiMHS[i] > 50 && nilaiMHS[i] <= 60) {
                kualifikasi[i] = "(C)";
                bobotNilai[i] = 2.00;
            }else if (nilaiMHS[i] > 39 && nilaiMHS[i] <= 50) {
                kualifikasi[i] = "(D)";
                bobotNilai[i] = 1.00;
            } else if (nilaiMHS[i] <= 39 ) {
                kualifikasi[i] = "(E)";
                bobotNilai[i] = 0.00;
            }
        }

        // menampilkan hasil konversi nilai
        System.out.println("======================");
        System.out.println("Nilai Konversi Nilai");
        System.out.println("=========================");

        // menampilkan tabel
        System.out.println("MK\t\t\t\t Nilai Angka\t Nilai Huruf \t Bobot Nilai" );
        for (int i = 0; i < jmlMK; i++) {
            System.out.println(namaMK[i] +"\t\t\t\t" + nilaiMHS[i] +"\t\t"+ kualifikasi[i] +"\t\t"+ bobotNilai[i]);
        }

        int total =0;
        int jmlSKS = 0;
        // menghitung ip semester
        for (int i = 0; i < nilaiMHS.length; i++) {
            total += bobotSKS[i] * bobotNilai[i];
            jmlSKS += bobotSKS[i];
        }

        double ipk = total / jmlSKS;
        System.out.println("========================");
        System.out.println("IP : " + ipk);

    }
}
