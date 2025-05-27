package Pertemuan_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antrian = new Antrian();
        Transaksi transaksi = new Transaksi(100);

        int pilih;
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new kendaraan(plat, tipe, merk));
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.hitungAntrian());
                    break;

                case 4:
                    kendaraan dilayani = antrian.layaniKendaraan();
                    if (dilayani == null) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                    } else {
                        System.out.println("Petugas melayani " + dilayani.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String jenisBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine();
                        BBM bbm = new BBM(jenisBBM, harga);
                        TransaksiPengisian t = new TransaksiPengisian(dilayani, bbm, liter);
                        transaksi.enqueue(t);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    }
                    break;

                case 5:
                    transaksi.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}

