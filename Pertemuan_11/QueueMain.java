package Pertemuan_11;

import java.util.Scanner;
public class QueueMain {
    public static void menu () {
        System.out.println("Menu Queue");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print ");
        System.out.println("4. Peek");
        System.out.println("5. Clear ");
        System.out.print("Masukan operasi yang diinginkan: ");
    }

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasistas Queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enQueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.deQueue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
