package Pertemuan_3;

import java.util.Scanner;
public class DosenDemo4 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Dosen4 dataDosen[] = new Dosen4[3];

        String kode,nama,gender;
        int umur;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data dosen ke-" +(i+1));
            System.out.print("Kode      : ");
            kode = str.nextLine();
            System.out.print("Nama      : ");
            nama = str.nextLine();
            System.out.print("Usia       : ");
            umur = str.nextInt(); str.nextLine();
            System.out.print("Jenis kelamin: ");
            gender = str.nextLine();
            System.out.println("--------------------------------------");
            
            dataDosen[i] = new Dosen4(kode, nama, gender, umur);

        }

        System.out.println("====== Menampilkan Data Dosen ========");
        for (int i = 0; i < dataDosen.length; i++) {
            System.out.println("Kode: " +dataDosen[i].kode);
            System.out.println("Nama: " + dataDosen[i].nama);
            System.out.println("Jenis kelamin: " +dataDosen[i].jenisKelamin);
            System.out.println("Usia: " +dataDosen[i].usia);
        }

        


        //// SOAL NOMOR 2
        for (int i = 0; i < dataDosen.length; i++) {
            dataDosen[i].dataSemuaDosen();
            System.out.println("--------------------");
        }
    }
}
