package Pertemuan_5;

import java.util.Scanner;
public class bruteForceDivideConquer {
    
    public static void main(String[] args) {
        Scanner str = new Scanner (System.in);
        System.out.print("Masukan nilai: ");
        int nilai = str.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai+ "menggunakan DC: " + fk.faktorialDC(nilai));

    }
}
