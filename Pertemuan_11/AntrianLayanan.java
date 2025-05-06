package Pertemuan_11;

public class AntrianLayanan {
    Mahasiswa [] data;
    int front;
    int rear;
    int maxSize;
    int size;

    // konstruktor Queue
    public AntrianLayanan (int max) {
        maxSize = max;
        this.data = new Mahasiswa [maxSize];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        
    }

    // method untuk mengecek apakah queue kosong
    public boolean IsEmpty () {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // method untuk mengecek apakah queue penuh
    public boolean IsFull () {
        if (size == maxSize) {
            return true;
        } else {
            return false;
        }
    }
    
    // method untuk menmapilkan elemen dari paling depan
    // method untuk melihat barisan terdepan
    public void peek () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    //method untuk menampilkan seluruh elemen Queue
    //method untuk menampilkan seluruh antrian
    public void print (){
        if (IsEmpty()) {
            System.out.println("Queue masih kososng");
            return;
        } 

        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % maxSize;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    // method untuk menghapus semua elemen pada Queue
    public void clear () {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // method enqueue untuk menambahkan isi queue dengan parameter
    // method tambah antrian
    public void enQueue (Mahasiswa mhs) {  
        if (IsFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % maxSize;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama +" berhasil masuk ke antrian");
    }

    // method deuqueue untuk mengeluarkan data dari queue dari posisi belakang
    // method melayani mahasiswa
    public Mahasiswa deQueue () {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } 
        Mahasiswa mhs = data[front];
        front = (front + 1) % maxSize;
        size--;
        return mhs;
    }

    //method menampilkan jumlah antrian
    public int jumlahantrian () {
        return size;
    } 

    // method untuk menmapilkan elemen terakhir
    // method untuk melihat barisan terakhir
    public void last () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
