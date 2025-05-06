package Pertemuan_11;

public class Queue {
    int [] data;
    int front;
    int rear;
    int maxSize;
    int size;

    // konstruktor Queue
    public Queue (int n) {
        maxSize = n;
        data = new int[maxSize];
        size = 0;
        front = rear = -1;
        
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
    public void peek () {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan adalah " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //method untuk menampilkan seluruh elemen Queue
    public void print (){
        if (IsEmpty()) {
            System.out.println("Queue masih kososng");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % maxSize;
            }
            System.out.println(data[i] + " ");
            System.out.println("jumlah elemen : " + size);
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
    public void enQueue (int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1); // Menghentikan program
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == maxSize - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    // method deuqueue untuk mengeluarkan data dari queue dari posisi belakang
    public int deQueue () {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1); // Menghentikan program
        } else {
            dt = data[ front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == maxSize - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
