package Pertemuan_1;

import java.util.Scanner;
public class tugas2Lagi {
    static Scanner str = new Scanner(System.in);
    public static void main(String[] args) {  
        // input panjang sisi
        System.out.print("Masukan panjang sisi: ");
        int sisi = str.nextInt();
        
        boolean kondisi = true;
        do {
            int pilihan = TampilMenu();

            switch (pilihan) {
                case 1: hitungVolume(sisi);
                    break;
                case 2: luasPermukaan(sisi);
                    break;
                case 3: keliling(sisi);
                    break; 
                case 4: kondisi = false;
                        System.out.println("Terima kasih");
                    break;
                default: System.out.println("input tidak valid");
                    break;
            }
            
        } while (kondisi);
         
    }
    
    public static int TampilMenu () {
        
        System.out.println("pilih menu yang anda inginkan!");
        System.out.println("1. menghitung hasil volume kubus");
        System.out.println("2. menghitung hasil luas permukaan kubus");
        System.out.println("3. menghitung hasil keliling kubus");
        System.out.println("4. Keluar");
        System.out.print("menu? : ");
        int menu = str.nextInt();

        return menu;
    }

    // fungsi hitung volume
    public static void hitungVolume (int sisi) {
        int hasil = sisi * sisi * sisi;

        System.out.println("volume kubus adalah: " + hasil);
    }

    // fungsu hitung luas permukaan
    public static void luasPermukaan (int sisi) {
        int hasil = 6  * (sisi * sisi);

        System.out.println("Luas permukaan kubus adalah: " + hasil);
    } 

    // fungsi hitung keliling
    public static void keliling (int sisi) {
        int hasil = 12 * sisi;
        
        System.out.println("Keliing kubus adalah: " + hasil);
    }
}
