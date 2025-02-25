package Pertemuan_2;

public class dosenMain04 {
    public static void main(String[] args) {
        
        // penggunaan konstruktor default
        dosen04 dosen1 = new dosen04();
        dosen1.idDosen = "452EDW";
        dosen1.nama = "DR. Tirta";
        dosen1.skill = "kedokteran";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        
        dosen1.tampilInformasi();
        
        // contoh penggunaan konstruktor berparameter
        dosen04 dosen2 = new dosen04("6T7HU", "Prof.Nabil", true, 2015, "UI/UX mobile developer");

        // menjalankan menthod
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja();
        dosen2.ubahKeahlian("Web Developer");
        dosen2.tampilInformasi();

        // contoh konstruktor berparameter
        mataKuliah04 matkulkul = new mataKuliah04("5SF78", "Pancasila", 3, 6);
        matkulkul.tampilInformasi();
    }
}
