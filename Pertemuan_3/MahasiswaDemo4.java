package Pertemuan_3;

import java.util.Scanner;
public class MahasiswaDemo4 {
    public static void main(String[]args) {
        Scanner str = new Scanner (System.in);
        Mahasiswa4[] arrayOfMahasiswa = new Mahasiswa4[3]; // deklarasi array of objct
        String dummy;
        
        Mahasiswa4[] myArrayOfMahasiswa = new Mahasiswa4[3];
        myArrayOfMahasiswa[0] = new Mahasiswa4();
        myArrayOfMahasiswa[0].nim = "244109080732";
        myArrayOfMahasiswa[0].nama = "Dewi yulistian";
        myArrayOfMahasiswa[0].kelas = "TI 1A";
        myArrayOfMahasiswa[0].ipk = (float) 3.55;

        System.out.println(myArrayOfMahasiswa[0].nim);
        System.out.println(myArrayOfMahasiswa[0].nama);
        System.out.println(myArrayOfMahasiswa[0].kelas);
        System.out.println(myArrayOfMahasiswa[0].ipk);
       

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa4();

            System.out.println("Masukan data mahasiswa ke-" +(i+1));
            System.out.print("NIM      : " );
            arrayOfMahasiswa[i].nim = str.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = str.nextLine();
            System.out.print("Kelas  :");
            arrayOfMahasiswa[i].kelas = str.nextLine();
            System.out.print("IPK    : ");
            dummy = str.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat (dummy);
            System.out.println("------------------------------------");
        }

        System.out.println("=========Menampilkan Data Mahasiswa =========");
        for (int i = 0; i < arrayOfMahasiswa.length; i++) { 
            arrayOfMahasiswa[i].cetakInfo();
        }
        

    }
}
