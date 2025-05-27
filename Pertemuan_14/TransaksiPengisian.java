package Pertemuan_14;

public class TransaksiPengisian {
    kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanTransaksi() {
        System.out.println(kendaraan.platNomor + ": Rp " + totalBayar);
    }
}

