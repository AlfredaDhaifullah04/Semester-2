package Pertemuan_1;

import java.util.Scanner;
public class fungsi {
    // deklarasi nama bunga
    static String NamaBunga[] = {"Alonema", "Keladi", "Alocasia", "Mawar"};
    
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        // input ingin mengecek stok barang atau melihat total penjualan 
        System.out.print("cek stok barang atau total penjualan? (stok/penjualan): ");
        String ingin = str.nextLine();
        
        if (ingin.equalsIgnoreCase("stok")) { // pilihan cek stok
            // pilih cabarng berapa
            System.out.print("Toko RoyalGarden cabang berapa yang anda ingin cek? ");
            int pilihan = str.nextInt(); str.nextLine();
            System.out.println("==================================");
            switch (pilihan) {
                case 1: RoyalGardenStok1();
                    break;
                case 2: RoyalGardenStok2();
                    break;
                case 3: RoyalGardenStok3();
                    break;
                case 4: RoyalGardenStok4();
                    break;
                default:
                    break;
            }

        } else if (ingin.equalsIgnoreCase("penjualan")) {
            System.out.print("Toko RoyalGarden cabang berapa yang anda ingin cek? ");
            int pilihan = str.nextInt();str.nextLine();
            System.out.println("========================");
            switch (pilihan) {
                case 1: RoyalGardenOmset1();
                    break;
                case 2: RoyalGardenOmset2();
                    break;
                case 3: RoyalGardenOmset3();
                    break;
                case 4: RoyalGardenOmset4();
                    break;
                default:
                    break;
            }
        }
    }

    // FUNGSI MENAMPILKAN STOK BARANG
    public static void RoyalGardenStok1 (){ // ROYAL GARDEN STOK 1 
        // menampilkan tabel nama bunga dan jumlah stok
        System.out.println("Stok cabang RoyalGarden 1");
        for (int i = 0; i < NamaBunga.length; i++) {
            System.out.print(NamaBunga[i] +"\t\t");
        }
        System.out.println();
        int jmlBunga[] = {10, 5, 15, 7}; // stok bunga
        for (int i = 0; i < NamaBunga.length; i++) {
            System.out.print(jmlBunga[i]+"\t\t");
        }
    }

    public static void RoyalGardenStok2 () { // ROYAL GARDEN STOK 2
         // menampilkan tabel nama bunga dan jumlah stok
         System.out.println("Stok cabang RoyalGarden 2");
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(NamaBunga[i] +"\t\t");
         }
         System.out.println();
         int jmlBunga[] = {6, 11, 9, 12}; // stok bunga
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(jmlBunga[i]+"\t\t");
         }
    }

    public static void RoyalGardenStok3 () { // ROYAL GARDEN STOK 3
         // menampilkan tabel nama bunga dan jumlah stok
         System.out.println("Stok cabang RoyalGarden 3");
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(NamaBunga[i] +"\t\t");
         }
         System.out.println();
         int jmlBunga[] = {2, 10, 10, 5}; // stok bunga
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(jmlBunga[i]+"\t\t");
         }
    }

    public static void RoyalGardenStok4() { // ROYAL GARDEN STOK 4
         // menampilkan tabel nama bunga dan jumlah stok
         System.out.println("Stok cabang RoyalGarden 4");
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(NamaBunga[i] +"\t\t");
         }
         System.out.println();
         int jmlBunga[] = {5, 7, 12, 9}; // stok bunga
         for (int i = 0; i < NamaBunga.length; i++) {
             System.out.print(jmlBunga[i]+"\t\t");
         }
    }

    // FUNGSI MENAMPILKAN OMSET 
    public static void RoyalGardenOmset1() {
        System.out.println("Total penjualan Cabang RoyalGarden 1");
        int jmlBunga[] = {10, 5, 15, 7}; // stok bunga
        double hargabunga[] = {75000, 50000,60000,10000}; //Harga tiap bunga

        // menghitung omset
        double omset =  0;
        for (int i = 0; i < jmlBunga.length; i++) {
            omset = omset + (jmlBunga[i] * hargabunga[i]);
        }
        // menghitung total penjualan tiap jenis bunga
        for (int i = 0; i < hargabunga.length; i++) {
            System.out.println("total  penjualan jenis " + NamaBunga[i] + " adalah: "+ (jmlBunga[i] * hargabunga[i]));
        }

        System.out.println("=======================================");
        System.out.println("Omset cabang RoyalGarden 1: " + omset);
    }

    public static void RoyalGardenOmset2() {  
        System.out.println("Total penjualan Cabang RoyalGarden 2");
        int jmlBunga[] = {6, 11, 9, 12}; // stok bunga
        double hargabunga[] = {75000, 50000,60000,10000}; // harga tiap bunga

        // menghitung omset
        double omset =  0;
        for (int i = 0; i < jmlBunga.length; i++) {
            omset = omset + (jmlBunga[i] * hargabunga[i]);
        }
        // menghitung total penjualan tiap jenis bunga
        for (int i = 0; i < hargabunga.length; i++) {
            System.out.println("total penjualan jenis " + NamaBunga[i] + " adalah: "+ (jmlBunga[i] * hargabunga[i]));
        }

        System.out.println("=======================================");
        System.out.println("Omset cabang RoyalGarden 2: " + omset);
    }

    public static void RoyalGardenOmset3() {  
        System.out.println("Total penjualan Cabang RoyalGarden 3");
        int jmlBunga[] = {2, 10, 10, 5}; // stok bunga
        double hargabunga[] = {75000, 50000,60000,10000}; // harga tiap bunga

        // menghitung omset
        double omset =  0;
        for (int i = 0; i < jmlBunga.length; i++) {
            omset = omset + (jmlBunga[i] * hargabunga[i]);
        }
        // menghitung total penjualan tiap jenis bunga
        for (int i = 0; i < hargabunga.length; i++) {
            System.out.println("total penjualan jenis " + NamaBunga[i] + " adalah: "+ (jmlBunga[i] * hargabunga[i]));
        }

        System.out.println("=======================================");
        System.out.println("Omset cabang RoyalGarden 3: " + omset);
    }

    public static void RoyalGardenOmset4() {  
        System.out.println("Total penjualan Cabang RoyalGarden 4");
        int jmlBunga[] = {5, 7, 12, 9}; // stok bunga
        double hargabunga[] = {75000, 50000,60000,10000}; // harga tiap bunga

        // menghitung omset
        double omset =  0;
        for (int i = 0; i < jmlBunga.length; i++) {
            omset = omset + (jmlBunga[i] * hargabunga[i]);
        }
        // menghitung total penjualan tiap jenis bunga
        for (int i = 0; i < hargabunga.length; i++) {
            System.out.println("total penjualan jenis " + NamaBunga[i] + " adalah: "+ (jmlBunga[i] * hargabunga[i]));
        }

        System.out.println("=======================================");
        System.out.println("Omset cabang RoyalGarden 4: " + omset);
    }
}
