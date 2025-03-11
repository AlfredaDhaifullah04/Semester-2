package Pertemuan_5;

import java.util.Scanner;
public class mainSum {
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        System.out.print("Masukan jumlah elemen");
        int elemen = str.nextInt();

        classSum sm = new classSum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan keuntungan ke-"+ (i+1)+ ": ");
            sm.keuntungan[i] = str.nextDouble();
        }

        System.out.println("Total keuntungan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan DIvide and conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
