package Pertemuan_3;

import java.util.Scanner;
public class MatakuliahDemo4 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Berapa banyak matkul: ");
        int panjang = str.nextInt();str.nextLine();
        
        MataKuliah4[] arrayOfMatkul = new MataKuliah4[panjang]; 
        String kode, nama,dummy;
        int sks,jumlahJam;

        
        // MENAMBAH DATA
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data mata kuliah ke-" +(i+1));
            System.out.print("Kode      : ");
            kode = str.nextLine();
            System.out.print("Nama      : ");
            nama = str.nextLine();
            System.out.print("Sks       : ");
            dummy = str.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = str.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");
            
            arrayOfMatkul[i] = new MataKuliah4(kode, nama, sks, jumlahJam);

            arrayOfMatkul[i].tambahData(kode, nama, sks, jumlahJam);
        }
                  
        // MENAMPILKAN DATA
        for (int i = 0; i < arrayOfMatkul.length; i++) {
            System.out.println("Data mata kuliah ke-" + (i+1));
            arrayOfMatkul[i].spillData();
        }
            



        // // melakukan pengisian parameter untuk mengakses konstruktor dengan 1 parameter
        // for (int i = 0; i < arrayOfMatkul.length; i++) {
            
        //     System.out.print("nama: ");
        //     String b = str.nextLine();
        //     arrayOfMatkul[i] = new MataKuliah4(b);
        // }  
        // // mengakses menthod
        // System.out.println("---------------------");
        // for (int i = 0; i < arrayOfMatkul.length; i++) {
        //     arrayOfMatkul[i].spillData();
        // }
            
        }
    }
