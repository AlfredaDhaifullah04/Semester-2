package Pertemuan_14;

public class Transaksi { // Linked LIst
    TransaksiPengisian[] data;
     int front, rear, size, capacity;

    public Transaksi(int kapasitas) {
        capacity = kapasitas;
        data = new TransaksiPengisian[kapasitas];
        front = rear = size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(TransaksiPengisian t) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % capacity;
        size++;
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        int index = front;
        for (int i = 0; i < size; i++) {
            data[index].tampilkanTransaksi();
            index = (index + 1) % capacity;
        }
    }
}

