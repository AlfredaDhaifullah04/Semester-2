package Pertemuan_2;
import java.util.Scanner;
public class dosen04 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String skill;

    void tampilInformasi () {
        System.out.println("=============================");
        System.out.println("dosen Dengan ID: " +idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("status kerja: " + statusAktif);
        System.out.println("Tahun bergabung: " +tahunBergabung);
        System.out.println("Bidang keahlian: " + skill);
    }
    
    void setStatusAktif(boolean st) {
        if (st == true) {
            System.out.println("Aktif");
        } else {
            System.out.println("Tidak aktif");
        }
    } 
    
    int hitungMasaKerja () {
        Scanner str = new Scanner(System.in);
        System.out.print("sekarang tahun berapa: ");
        int tahunIni = str.nextInt();
        str.close();
        int lamaNgajar = tahunBergabung - tahunIni;
        System.out.println("Telah ngajar selama: " + lamaNgajar);
        return lamaNgajar;
    }

    void ubahKeahlian (String newSkill) {
        skill = newSkill;
    }

    public dosen04 () {

    }

    public dosen04(String idDosen, String nm, boolean sta, int join, String keahlian) {
        this.idDosen = idDosen;
        nama = nm;
        statusAktif = sta;
        tahunBergabung = join;
        skill = keahlian;
    }
}
