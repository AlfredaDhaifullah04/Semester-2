package Pertemuan_4;

import java.util.Scanner;
public class cafeMain {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);

        // input banyak cafe
        System.out.print("Masukan jumlah cafe: ");
        int bykCafe = str.nextInt(); str.nextLine();

        // membuatk array utnuk menyimpan objek Cafe
        cafe04[] cafe = new cafe04[bykCafe];

        // menginputkan data cafe
        for (int i = 0; i < cafe.length; i++) {
            System.out.println("\nMasukkan data untuk Cafe ke-" + (i + 1));
            System.out.print("Nama Cafe: ");
            String nama_cafe = str.nextLine();
            System.out.print("Lokasi: ");
            String lokasi = str.nextLine();
            System.out.print("Menu: ");
            String menu = str.nextLine();
            System.out.print("Jam Operasional: ");
            String jamOperasional = str.nextLine();

            
            cafe[i] = new cafe04(nama_cafe, lokasi, menu, jamOperasional);
        }

        // menampilkna data seluruh cafe
        System.out.println("====== Data seluruh cafe =======");
        for (int i = 0; i < cafe.length; i++) {
            cafe[i].TampilkanDataSeluruhCafe();
        }

        // menampilkan menu setiap caffe
        for (int k = 0; k < cafe.length;k++) {
            cafe[k].tampilMenu();
        }
    }
}
