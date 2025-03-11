package Pertemuan_5;

import java.util.Scanner;
public class mainPangkat {
    public static void main (String []args) {
        Scanner str = new Scanner (System.in);
        System.out.println("Masukan jumlah elemen: ");
        int element = str.nextInt();

        Pangkat[] png = new Pangkat[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Masukan nilai basis elemen ke-" + (i+1)+": ");
            int basis = str.nextInt();
            System.out.print("Masukan nilai pangkatelemen ke-" +(i+1)+": ");
            int pangkat = str.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat p: png) {
            System.out.println(p.nilai +"^"+ p.pangkat+": " + p.pangkatBF());
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai,p.pangkat));
        }
    }
}
