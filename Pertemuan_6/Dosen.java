package Pertemuan_6;
import java.util.Scanner;

class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Usia: " + usia + ", Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }
}

class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingASC() { // Bubble Sort
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() { // Selection Sort
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Muda -> Tua)");
            System.out.println("4. Sorting DSC (Usia Tua -> Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true = Laki-laki, false = Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data telah diurutkan secara ASC!");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan secara DSC!");
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        
        sc.close();
    }
}
