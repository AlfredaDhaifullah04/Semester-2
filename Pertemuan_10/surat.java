package Pertemuan_10;
import java.util.Scanner;
import java.util.Stack;

class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S = Sakit, I = Izin
    int durasi;

    public Surat() {
    }

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilkan() {
        System.out.println("ID Surat      : " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas         : " + kelas);
        System.out.println("Jenis Izin    : " + jenisIzin);
        System.out.println("Durasi        : " + durasi + " hari");
    }
}

class StackSurat {
    Stack<Surat> daftarSurat = new Stack<>();

    public void terimaSurat(Surat surat) {
        daftarSurat.push(surat);
    }

    public void prosesSurat() {
        if (!daftarSurat.isEmpty()) {
            Surat diproses = daftarSurat.pop();
            System.out.println("Surat berikut telah diproses:");
            diproses.tampilkan();
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
        }
    }

    public void lihatSuratTerakhir() {
        if (!daftarSurat.isEmpty()) {
            System.out.println("Surat Terakhir:");
            daftarSurat.peek().tampilkan();
        } else {
            System.out.println("Tidak ada surat yang tersedia.");
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (Surat s : daftarSurat) {
            if (s.namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                s.tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dari mahasiswa dengan nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}

public class surat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat stackSurat = new StackSurat();
        int pilihan;

        do {
            System.out.println("\n=== MENU SURAT IZIN MAHASISWA ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = input.nextInt();
                    input.nextLine(); // konsumsi newline
                    stackSurat.terimaSurat(new Surat(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    stackSurat.prosesSurat();
                    break;

                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = input.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}
