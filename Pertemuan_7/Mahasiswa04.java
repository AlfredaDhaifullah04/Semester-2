package Pertemuan_7;
import java.util.Scanner;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04 (){

    }

    Mahasiswa04 (String nm, String nim, String kls, double ip) {
        nama = nm;
        this.nim = nim;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi () {
        System.out.println("Nama   : " + nama);
        System.out.println("Nim    : " + nim);
        System.out.println("Kelas  : " + kelas);
        System.out.println("Ipk    : " + ipk);
        System.out.println("---------------------------");
    }
    
}

// CLASS MAHASISWA BERPRESTASI
class MahasiswaBerprestasi04 {
    Mahasiswa04 listMhs [];
    int idx = 0;

    MahasiswaBerprestasi04 () {

    }
    // Konstruktor berparameter
    MahasiswaBerprestasi04 (int k) { // k = jumlah panjang array
       listMhs = new Mahasiswa04[k];
    }

    // method tampil
    void tampil () {
        System.out.println("-------------------------------");
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].tampilInformasi();
        }
        System.out.println("=================================");
    }

    void tambah(Mahasiswa04 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    int sequentinalSearching (double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
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
            if (cari == listMhs[mid].ipk) {
                return(mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid-1, right); 
            }
        } return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    void tampilDataSearch (double x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}

class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Masukan jumlah seluruh mahasiswa: ");
        int jumMhs = str.nextInt(); str.nextLine();
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukan data mahasiswa ke-" + (i+1));
            System.out.print("Nim  : ");
            String nim = str.nextLine();
            System.out.print("Nama : " );
            String nama = str.nextLine();
            System.out.print("kelas : ");
            String kelas = str.nextLine();
            System.out.print("IPK  : ");
            double ipk = str.nextDouble();
            str.nextLine();

            list.tambah(new Mahasiswa04(nama, nim, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian dara sequential
        System.out.println("---------------------------");
        System.out.println(" Pencarian Data ");
        System.out.println("---------------------------");
        System.out.println("Masukan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = str.nextDouble(); str.nextLine();

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentinalSearching(cari);
        int pss = posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
         // melakukan pencarian data Binary Search 
         // data harus diurutkan terlebih dahulu
         System.out.println("---------------------------");
         System.out.println(" Pencarian Data ke 2");
         System.out.println("---------------------------");
         System.out.println("Masukan ipk mahasiswa yang dicari: ");
         System.out.print("IPK: ");
         double cari2 = str.nextDouble(); str.nextLine();
 
         System.out.println("Menggunakan Binary Search");
         int posisi2 = list.findBinarySearch(cari2, 0, jumMhs -1);
         int pss2 = posisi2;
         list.tampilPosisi(cari, pss2);
         list.tampilDataSearch(cari, pss2);
    }
}


