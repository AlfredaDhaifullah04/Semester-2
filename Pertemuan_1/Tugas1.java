package Pertemuan_1;

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        char kode [] = new char[10];
        char kota [][] = new char[10][12];
        
        kota [0][0] = 'B'; kota [1][0] = 'J'; kota [2][0] = 'B'; kota [3][0] = 'C'; 
        kota [0][1] = 'A'; kota [1][1] = 'A'; kota [2][1] = 'A'; kota [3][1] = 'I'; 
        kota [0][2] = 'N'; kota [1][2] = 'K'; kota [2][2] = 'N'; kota [3][2] = 'R'; 
        kota [0][3] = 'T'; kota [1][3] = 'A'; kota [2][3] = 'D'; kota [3][3] = 'E'; 
        kota [0][4] = 'E'; kota [1][4] = 'R'; kota [2][4] = 'U'; kota [3][4] = 'B'; 
        kota [0][5] = 'N'; kota [1][5] = 'T'; kota [2][5] = 'N'; kota [3][5] = 'O'; 
                           kota [1][6] = 'A'; kota [2][6] = 'G'; kota [3][6] = 'N'; 
        
        kota [4][0] = 'B';  kota [5][0] = 'P';  kota [6][0] = 'S'; kota [7][0] = 'S';
        kota [4][1] = 'O';  kota [5][1] = 'E';  kota [6][1] = 'E'; kota [7][1] = 'U';
        kota [4][2] = 'G';  kota [5][2] = 'K';  kota [6][2] = 'M'; kota [7][2] = 'R';
        kota [4][3] = 'O';  kota [5][3] = 'A';  kota [6][3] = 'A'; kota [7][3] = 'A';
        kota [4][4] = 'R';  kota [5][4] = 'L';  kota [6][4] = 'R'; kota [7][4] = 'B';
                            kota [5][5] = 'O';  kota [6][5] = 'A'; kota [7][5] = 'A';
                            kota [5][6] = 'N';  kota [6][6] = 'N'; kota [7][6] = 'Y';
                            kota [5][7] = 'G';  kota [6][7] = 'G'; kota [7][7] = 'A';
                            kota [5][8] = 'A';
                            kota [5][9] = 'N';   
        kota [8][0] = 'M';  
        kota [8][1] = 'A'; kota [9][0] = 'T';
        kota [8][2] = 'L'; kota [9][1] = 'E';
        kota [8][3] = 'A'; kota [9][2] = 'G';
        kota [8][4] = 'N'; kota [9][3] = 'A';
        kota [8][5] = 'G'; kota [9][4] = 'L';
        

        System.out.print("masukan huruf plat anda ? (A - t) ");
        String pilihan = str.nextLine();
        
        if (pilihan.equalsIgnoreCase("A")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[0][i]);
            }
        } else if (pilihan.equalsIgnoreCase("B")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[1][i]);
            }
        } else if (pilihan.equalsIgnoreCase("D")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[2][i]);
            }
        } else if (pilihan.equalsIgnoreCase("E")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[3][i]);
            }
        } else if (pilihan.equalsIgnoreCase("F")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[4][i]);
            }
        } else if (pilihan.equalsIgnoreCase("G")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[5][i]);
            }
        } else if (pilihan.equalsIgnoreCase("H")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[6][i]);
            }
        } else if (pilihan.equalsIgnoreCase("L")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[7][i]);
            }
        } else if (pilihan.equalsIgnoreCase("N")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[8][i]);
            }
        } else if (pilihan.equalsIgnoreCase("T")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[9][i]);
            }
        } else {
            
        }
        
    }
}
