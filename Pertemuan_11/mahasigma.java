package Pertemuan_11;
import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private int semester;

    public Mahasiswa(String nim, String nama, String prodi, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.semester = semester;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi + ", Semester: " + semester;
    }
}

class AntrianKRS {
    private final int maxSize = 10;
    private Mahasiswa[] queue;
    private int front;
    private int rear;
    private int count;
    private int processed;

    public AntrianKRS() {
        queue = new Mahasiswa[maxSize];
        front = 0;
        rear = -1;
        count = 0;
        processed = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void clear() {
        front = 0;
        rear = -1;
        count = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = mhs;
        count++;
        System.out.println("Mahasiswa " + mhs.getNama() + " berhasil ditambahkan ke antrian");
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa untuk diproses.");
            return null;
        }
        Mahasiswa temp = queue[front];
        front = (front + 1) % maxSize;
        count--;
        processed++;
        return temp;
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar seluruh mahasiswa dalam antrian:");
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.println((c + 1) + ". " + queue[i]);
            i = (i + 1) % maxSize;
        }
    }

    public void displayFront2() {
        if (count < 1) {
            System.out.println("Tidak ada cukup mahasiswa dalam antrian");
            return;
        }
        System.out.println("2 mahasiswa terdepan dalam antrian:");
        System.out.println("1. " + queue[front]);
        if (count >= 2) {
            System.out.println("2. " + queue[(front + 1) % maxSize]);
        }
    }

    public void displayLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Mahasiswa terakhir dalam antrian:");
        System.out.println(queue[rear]);
    }

    public int getQueueCount() {
        return count;
    }

    public int getProcessedCount() {
        return processed;
    }

    public int getRemaining() {
        return Math.max(0, 30 - processed);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int choice;

        do {
            System.out.println("\n=== Sistem Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah yang Sudah Diproses");
            System.out.println("8. Cek Jumlah yang Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Masukkan Semester: ");
                    int semester = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, semester);
                    antrian.enqueue(mhs);
                    break;
                    
                case 2:
                    System.out.println("Memproses KRS untuk 2 mahasiswa terdepan:");
                    Mahasiswa mhs1 = antrian.dequeue();
                    Mahasiswa mhs2 = antrian.dequeue();
                    
                    if (mhs1 != null) {
                        System.out.println("1. " + mhs1 + " - KRS telah disetujui");
                    }
                    if (mhs2 != null) {
                        System.out.println("2. " + mhs2 + " - KRS telah disetujui");
                    }
                    break;
                    
                case 3:
                    antrian.displayAll();
                    break;
                    
                case 4:
                    antrian.displayFront2();
                    break;
                    
                case 5:
                    antrian.displayLast();
                    break;
                    
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getQueueCount());
                    break;
                    
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrian.getProcessedCount());
                    break;
                    
                case 8:
                    System.out.println("Jumlah mahasiswa yang belum diproses: " + antrian.getRemaining());
                    break;
                    
                case 9:
                    antrian.clear();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}