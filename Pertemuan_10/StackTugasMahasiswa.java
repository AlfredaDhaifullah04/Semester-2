package Pertemuan_10;

public class StackTugasMahasiswa {
    Mahasiswa04 [] stack;
    int size;
    int top;

    public StackTugasMahasiswa (int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }

    // methid yang digunakan untuk mengecek apakah stack sudah terisi penuh sesuai kapasitas
    public boolean isFull () {
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    // untuk mengecek apakah tumpukan masih kossong
    public boolean isEmpty () {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // untuk menambah tugas ke tumpukan stack
    public void push (Mahasiswa04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("stack penuh! Tidak busa menambahkan tugas lagi");
        }
    }

    // method untuk mengeluarkan tugas yang akan dinilai
    public Mahasiswa04 pop () {
        if (!isEmpty()) {
            Mahasiswa04 m = stack [top];
            // top--;
            return m;
        } else {
            System.out.println("Stack kososng! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // untuk mengecek tumpukan tugas paling atas
    public Mahasiswa04 peek () {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    } 

    // untuk melihat tugas terbawah
    public Mahasiswa04 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Elemen pertama dalam stack
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // untuk menampilkan seluruh daftar tugas mahasiswa
    public void print () {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

        // untuk menghitung jumlah tugas yang sudah dikumpulkan
    public int jumlahTugas() {
        return top + 1; // Karena indeks top dimulai dari -1
    }


    // KONVERSI DECIMAL KE BINER
    public String koversiDecimalKeBiner (int nilai) {
        StackKonversi stack = new StackKonversi(5);
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String ();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
