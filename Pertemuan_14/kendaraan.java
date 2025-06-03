package Pertemuan_14;

public class Kendaraan{
    String platNomor,tipe,merk;

    public Kendaraan(String plt,String tp,String merk){
        platNomor=plt;
        tipe=tp;
        this.merk=merk;
    }
    void tampilkanInformasi(){
        System.out.println("plat nomor: "+platNomor);
        System.out.println("tipe: "+tipe);
        System.out.println("merk: "+merk);
    }
}
