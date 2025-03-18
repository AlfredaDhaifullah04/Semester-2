package Pertemuan_6;

import java.util.Scanner;
public class mahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        
        System.out.print("Masukan jumlah Mahasiswa: ");
        int jml = str.nextInt(); str.nextLine();
        
        mahasiswaBerprestasi04 list = new mahasiswaBerprestasi04(jml);

        for (int i = 0; i < jml ; i++) {
            System.out.println("----------------------------");
            System.out.println("Masukan data mahasiswa ke " + (i+1));
            System.out.print("Masukan NIM: ");
            String nmrIN = str.nextLine();
            System.out.print("Masukan Nama: ");
            String nma = str.nextLine();
            System.out.print("Masukan kelas: ");
            String kls = str.nextLine();
            System.out.print("Masukan IPK: ");
            double ipk = str.nextDouble();
            str.nextLine();

            mahasiswa04 m = new mahasiswa04(nmrIN, nma, kls, ipk);
            list.tambah(m);
        }
        // mahasiswa04 m1 = new mahasiswa04("123", "Nabiel", "1A", 3.2);
        // mahasiswa04 m2 = new mahasiswa04("124","Fajel" , "1A", 3.5);
        // mahasiswa04 m3 = new mahasiswa04("125", "King Raihan", "1A", 3.1);
        // mahasiswa04 m4 = new mahasiswa04("126", "Hanip", "1A", 3.9);
        // mahasiswa04 m5 = new mahasiswa04("127", "ariq", "1A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        list.Tampil();

        // System.out.println("data Mahasiswa setelah sorting BUBBLE SORT berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.Tampil();

        // System.out.println("Data mahasiswa setelah sorting menggunakan SELECTION SORT (ASC)");
        // list.SelectionSort();
        // list.Tampil();

        System.out.println("Data mahasiswa setelah sorting mwnggunakan INSERTION SORT (ASC)");
        list.InsertionSort();
        list.Tampil();
    }
}
