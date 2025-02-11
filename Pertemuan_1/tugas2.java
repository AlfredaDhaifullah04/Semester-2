package Pertemuan_1;

import java.util.Scanner;
public class tugas2 {

    //fungsii hitung volume
    public static double hitungVolume(double sisi) {
        return sisi * sisi;
    }

    // fungsi hitung luas permukaan 
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi;
    }

    //fungi hitung keliling
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Menu Perhitungan Kubus:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");

            // pilihan menu
            System.out.print("Pilih menu (1-4): ");
            String pilihan = scanner.nextLine();
            
            
            if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3")) {
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = scanner.nextDouble();
                if (sisi <= 0) {
                    System.out.println("Panjang sisi harus lebih dari 0!");
                    continue;
                }
                    
                    switch (pilihan) {
                        case "1": System.out.println("Volume kubus: " + hitungVolume(sisi));
                            break;
                        case "2": System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                            break;
                        case "3": System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                            break;
                        default: System.out.println("Masukkan angka yang valid!");
                            break;
                        }
            } else  if (pilihan.equalsIgnoreCase("4")) {
                System.out.println("sistem done");
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih lagi!");
            }
        }
       
    }
}

