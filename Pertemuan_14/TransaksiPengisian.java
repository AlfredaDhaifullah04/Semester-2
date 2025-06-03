package Pertemuan_14;

public class transaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public transaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter,double totalBayar) {
        this.kendaraan=kendaraan;
        this.bbm=bbm;
        this.liter=liter;
        this.totalBayar=totalBayar* liter;
    }
    void tampilkanTransaksi(){
        System.out.println(kendaraan.platNomor+": Rp "+ totalBayar);
    }
}
