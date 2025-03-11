package Pertemuan_4;

public class cafe04 {
    String namaCafe;
    String lokasi;
    String Menu;
    String jamOperasional;

    // fungsi untuk menampilkan data seluru cafe
    public void TampilkanDataSeluruhCafe () {
        System.out.println("\nNama Cafe: " + namaCafe);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Menu: " + Menu);
        System.out.println("Jam Operasional: " + jamOperasional);
    }

    // fungsi untuk menampilkna menu cafe
    public void tampilMenu () {
        System.out.println("Menu di " + namaCafe +": " + Menu);
    }

    // konstruktor default
    public cafe04 () {

    }

    // konstruktor berparameter
    public cafe04 (String nma, String lokasi, String menu, String operasional) {
        namaCafe = nma;
        this.lokasi = lokasi;
        Menu = menu;
        jamOperasional = operasional;
    }

}
