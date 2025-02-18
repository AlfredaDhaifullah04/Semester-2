package Pertemuan_1;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah anda: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) { // inpiut data mata kuliah
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }
        
        while (true) { // tampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 5) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nSeluruh Jadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i] + " - Hari: " + hariKuliah[i]);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    System.out.println("\nJadwal Kuliah untuk " + hari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\nJadwal Kuliah untuk Semester " + sem + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == sem) {
                            System.out.println(namaMatkul[i] + " - SKS: " + sks[i] + " - Hari: " + hariKuliah[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cari = scanner.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMatkul[i].equalsIgnoreCase(cari)) {
                            System.out.println("Ditemukan: " + namaMatkul[i] + " - SKS: " + sks[i] + " - Semester: " + semester[i] + " - Hari: " + hariKuliah[i]);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        scanner.close();
    }
}

