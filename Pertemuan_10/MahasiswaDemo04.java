package Pertemuan_10;
import java.util.Scanner;
public class MahasiswaDemo04 {
    public static void main(String[]args) {
        Scanner scan = new Scanner (System.in);
        int pick;
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Megumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Melihat tugas pertama");
            System.out.println("6. cek berapa banyak tugas yang dikumpulkan");
            System.out.print("piliih: ");
            pick = scan.nextInt();
            scan.nextLine();
            switch (pick) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM : ");
                    String nim = scan.nextLine();
                    System.out.print("kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf(" Tugas %s berhasi dikumpulkan \n", mhs.nama);
                    break;
                case 2 :
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menulai tugas daru " + dinilai.nama);
                        System.out.println("Masukan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf( "nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.koversiDecimalKeBiner(nilai);
                        System.out.println("nilai Biner Tugas : " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpukan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa04 see = stack.peekBottom();
                    if (see != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + see.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang dikumpulkan: " + stack.jumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tudak valid");
            }
        } while (pick >= 1 && pick <=6 );
        scan.close();
    }
}
