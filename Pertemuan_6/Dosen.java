package Pertemuan_6;
import java.util.Scanner;

import Pertemuan_2.dosen04;

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

    int SearchNama (String cari) { // pencarian menggunakan sequentinal Searching berdasarkan Nama
        int posisi = -1;
        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(null)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch (double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left+right)/2;
            if (cari == dataDosen[mid].usia) {
                return(mid);
            } else if (dataDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid-1, right); 
            }
        } return -1;
    }

    void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan usia : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("dosen dengan umur " + x + " tidak ditemukan");
        }
    }
    
    void tampilDataSearch (int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t : " + dataDosen[pos].kode);
            System.out.println("Nama\t : " + dataDosen[pos].nama);
            System.out.println("Jenis kelamin\t : " + dataDosen[pos].jenisKelamin);
            System.out.println("umur\t : " + dataDosen[pos].usia);
        } else {
            System.out.println("Data Dosen dengan usia " + x + " tidak ditemukan");
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
            System.out.println("5. Mencari data Dosen berdasarkan Nama");
            System.out.println("6. Melakukan pencarian Data dosen berdasarkan umur");
            System.out.println("7. Keluar program");
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
                    System.out.println("Masukan Nama Dosen yang ingin dicari: ");
                    String nm = sc.nextLine();
                    data.SearchNama(nm);
                    break;
                case 6: 
                    System.out.println("Keluar dari program.");
                    break;
                case 7 :
                    System.out.print("Masukan umur dosen yang ingin dicari: ");
                    int find = sc.nextInt(); sc.nextLine();
                    data.sortingASC();
                    data.findBinarySearch(find, 0, 10-1); // 10 adalah jumlah dosen
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        
        sc.close();
    }
}
