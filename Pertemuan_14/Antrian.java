package Pertemuan_14;

public class Antrian { // Linked List
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(kendaraan k) {
        Node baru = new Node(k);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada kendaraan dalam antrian.");
            return;
        }
        System.out.println("-- Antrian Kendaraan --");
        Node temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            System.out.println();
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        int jumlah = 0;
        Node temp = head;
        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }
        return jumlah;
    }

    public kendaraan layaniKendaraan() {
        if (isEmpty()) {
            return null;
        }
        kendaraan dilayani = head.data;
        head = head.next;
        if (head == null) tail = null;
        return dilayani;
    }
}

