package Pertemuan_1;

import java.util.Scanner;
public class tugas3Lagi {
    static Scanner str = new Scanner (System.in);

    public static void main(String[] args) {
        
        System.out.println("berapa mata kuliah yang anda ambil?: ");
        int n = str.nextInt();
        str.nextLine();

        String namaMK[] = new String[n];
        int sks[] = new int[n];
        int semester[] = new int[n];
        String hari[] = new String[n];
        

        // menginput data perkuliahan 
        for (int i = 0; i < n; i++) {
            System.out.println("Nama mata kuliah yang anda ambil: ");
            namaMK[i] = str.nextLine();
            System.out.println("Berapa SKS yang anda ambil: ");
            sks[i] = str.nextInt(); str.nextLine();
            System.out.println("Semester berapa yang anda ambil: ");
            semester[i] = str.nextInt();str.nextLine();
            System.out.println("hari apa yang anda ambil: ");
            hari[i] = str.nextLine();
        }

        do {
            
            int menu =tampilMenu();
    
            switch (menu) {
                case 1: spillJadwal();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (true);
    }

    public static int tampilMenu() {
        System.out.println("pilih menu yang ingin anda pilih: ");
        System.out.println("1. menampilkan seluruh jadwal kuliah");
        System.out.println("2. Menampilkan jadwal berdasarkan hari tertentu");
        System.out.println("3. menampilkan jadwal kuliah berdasarkan semester ");
        System.out.println("4. keluar");
        int pilihan = str.nextInt(); str.nextLine();
        return pilihan;
    }

    public static void spillJadwal () {

    }
}
