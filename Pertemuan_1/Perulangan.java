package Pertemuan_1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
         Scanner str = new Scanner (System.in);

        System.out.print("Masukan NIM anda: ");
        double nim = str.nextDouble();
        
        str.close();
        int n = 19;

        for (int i = 1; i <= 19; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i+" ");
            } else if (i % 2 == 1) {
                System.out.print("* ");
            }
        }
    }
}
