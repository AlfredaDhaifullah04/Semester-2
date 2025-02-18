package Pertemuan_1;

import java.util.Scanner;
public class tugas1Lagi {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        char kode[] = new char[10];
        char kota[][] = new char[10][12];

        kota[0] = new char[] {'B','A','N','T','E','N'};
        kota[1] = new char[] {'J','A','K','A','R','T','A'};
        kota[2] = new char[] {'B','A','N','D','U','N','G'};
        kota[3] = new char[] {'C','I','R','E','B','O','N'};
        kota[4] = new char[] {'B','O','G','O','R'};
        kota[5] = new char[] {'P','E','K','A','L','O','N','G','A','N'};
        kota[6] = new char[] {'S','E','M','A','R','A','N','G'};
        kota[7] = new char[] {'S','U','R','A','B','A','Y','A'};
        kota[8] = new char[] {'M','A','L','A','N','G'};
        kota[9] = new char[] {'T','E','G','A','L'};
        
        System.out.print("Masukan kode kota anda: ");
        String key = str.nextLine();

        if (key.equalsIgnoreCase("A")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[0][i]);
            }
        } else if (key.equalsIgnoreCase("B")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[1][i]);
            }
        } else if (key.equalsIgnoreCase("D")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[2][i]);
            }
        } else if (key.equalsIgnoreCase("E")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[3][i]);
            }
        } else if (key.equalsIgnoreCase("F")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[4][i]);
            }
        } else if (key.equalsIgnoreCase("G")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[5][i]);
            }
        } else if (key.equalsIgnoreCase("H")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[6][i]);
            }
        } else if (key.equalsIgnoreCase("L")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[7][i]);
            }
        } else if (key.equalsIgnoreCase("N")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[8][i]);
            }
        } else if (key.equalsIgnoreCase("T")) {
            for (int i = 0; i < kota.length; i++ ) {
                System.out.print(kota[9][i]);
            }
        } else {
            
        }
    }
}
