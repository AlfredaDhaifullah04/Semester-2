package Pertemuan_11;
import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan = 0;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah Mahasiswa dalam antrian");
            System.out.println("0. keluar");
            System.out.print("pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("NAMA  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi :");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas :");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enQueue(mhs);
                    break;
                case 2: 
                    Mahasiswa dilayani = antrian.deQueue();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    System.out.println("jumlah dalam antrian: " + antrian.jumlahantrian());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
