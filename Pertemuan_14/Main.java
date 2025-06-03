package Pertemuan_14;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedListAntrian antrian=new linkedListAntrian();
        queueTransaksi transaksi=new queueTransaksi(100);

        int pilih;
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. tambah antrian kendaraan");
            System.out.println("2. tampilkan antrian");
            System.out.println("3. cek Jumlah antrian kendaraan");
            System.out.println("4. layani kendaraan");
            System.out.println("5. tampilkan riwayat transaksi");
            System.out.println("0. keluar");
            System.out.print("pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("masukkan plat nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("masukkan jenis kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("masukkan merk: ");
                    String merk = sc.nextLine();
                    Kendaraan kd=new Kendaraan(plat,tipe,merk);
                    antrian.tambahAntrian(kd);
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> jumlah kendaraan dalam antrian: "+antrian.hitungAntrian());
                    break;
                case 4:
                    Kendaraan dilayani=antrian.layaniKendaraan();
                    if(dilayani == null){
                        System.out.println("tidak ada kendaraan dalam antrian");
                    }else{
                        System.out.println("petugas melayani "+dilayani.platNomor);
                        System.out.print("masukkan jenis BBM: ");
                        String jenisBBM=sc.nextLine();
                        System.out.print("masukkan harga per liter: ");
                        double harga=sc.nextDouble();
                        System.out.print("masukkan jumlah liter: ");
                        double liter=sc.nextDouble();
                        sc.nextLine();
                        BBM bbm=new BBM(jenisBBM,harga);
                        transaksiPengisian t=new transaksiPengisian(dilayani,bbm,liter,harga);
                        transaksi.enqueue(t);
                        System.out.println(">> transaksi berhasil dicatat");
                    }
                    break;
                case 5:
                    transaksi.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while(pilih != 0);
    }
}
