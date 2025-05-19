package Pertemuan_12;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    
    void tampilData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }
}

class Node {
    Mahasiswa data;
    Node next;
    
    public Node(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }
}

class AntrianKemahasiswaan {
    private Node front;
    private Node rear;
    private int size;
    private final int MAX_SIZE = 100; // Batas maksimal antrian
    
    public AntrianKemahasiswaan() {
        front = null;
        rear = null;
        size = 0;
    }
    
    // c. Cek antrian kosong
    public boolean isEmpty() {
        return front == null;
    }
    
    // d. Cek antrian penuh
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    
    // d. Mengosongkan antrian
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }
    
    // e. Menambahkan antrian
    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan lagi.");
            return;
        }
        
        Node newNode = new Node(mhs);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " telah ditambahkan ke antrian");
    }
    
    // f. Memanggil antrian
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        
        Mahasiswa mhs = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Mahasiswa " + mhs.nama + " dipanggil");
        return mhs;
    }
    
    // g. Menampilkan antrian terdepan
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Mahasiswa terdepan:");
        front.data.tampilData();
    }
    
    // g. Menampilkan antrian paling akhir
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Mahasiswa terakhir:");
        rear.data.tampilData();
    }
    
    // h. Menampilkan jumlah mahasiswa yang mengantre
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size);
    }
    
    // Menampilkan seluruh antrian
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("Daftar Antrian:");
        Node current = front;
        int no = 1;
        while (current != null) {
            System.out.print(no++ + ". ");
            current.data.tampilData();
            System.out.println("-------------------");
            current = current.next;
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKemahasiswaan antrian = new AntrianKemahasiswaan();
        
        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan);
                    antrian.enqueue(mhs);
                    break;
                    
                case 2:
                    antrian.dequeue();
                    break;
                    
                case 3:
                    antrian.peekFront();
                    break;
                    
                case 4:
                    antrian.peekRear();
                    break;
                    
                case 5:
                    antrian.jumlahAntrian();
                    break;
                    
                case 6:
                    antrian.displayQueue();
                    break;
                    
                case 7:
                    antrian.clear();
                    break;
                    
                case 8:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}