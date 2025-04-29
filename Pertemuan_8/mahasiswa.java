package Pertemuan_8;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

    mahasiswa (String nimm,String namaa,String prodii) {
        nim = nimm;
        nama = namaa;
        prodi = prodii; 
    }

    void tampilMahasiswa () {
        System.out.println("NIM: " + nim+ "| Nama: " + nama+"| Prodi: "+ prodi);
    }
}
