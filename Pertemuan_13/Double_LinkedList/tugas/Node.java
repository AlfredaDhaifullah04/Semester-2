package Pertemuan_13.Double_LinkedList.tugas;

import java.util.Scanner;

class Node {
    int no;
    String nama;
    Node prev, next;

    Node(int no, String nama) {
        this.no = no;
        this.nama = nama;
        this.prev = null;
        this.next = null;
    }
}

class Queue {
    private Node head, tail;
    private int count = 0;
    private int totalVaksinasi = 0;

    public void enqueue(int no, String nama) {
        Node newNode = new Node(no, nama);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Data " + head.nama + " telah selesai divaksinasi.");
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;

        count--;
        totalVaksinasi++;
    }

    public void display() {
        Node current = head;
        System.out.println("+------------------------------+");
        System.out.println("| Daftar Pengantre Vaksin     |");
        System.out.println("+-----+------------------------+");
        System.out.println("| No  | Nama                   |");
        System.out.println("+-----+------------------------+");

        while (current != null) {
            System.out.printf("| %-3d | %-22s |\n", current.no, current.nama);
            current = current.next;
        }

        System.out.println("+------------------------------+");
        System.out.println("Sisa Antrian: " + count);
    }

    public int getTotalVaksinasi() {
        return totalVaksinasi;
    }
}

 class AntrianVaksin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();

        int pilihan;
        do {
            System.out.println("*******************************");
            System.out.println("PENGANTRE VAKSIN EXTRAVAGANZA");
            System.out.println("*******************************");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantre Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan No: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(no, nama);
                    break;

                case 2:
                    antrian.dequeue();
                    System.out.println("Total yang sudah divaksin: " + antrian.getTotalVaksinasi());
                    break;

                case 3:
                    antrian.display();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilihan != 4);
    }
}

