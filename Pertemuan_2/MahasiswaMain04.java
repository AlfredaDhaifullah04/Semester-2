package Pertemuan_2;

public class MahasiswaMain04 {
    public static void main(String[] args) {
        
        mahasiswa04 mhs1 /*mhs1 = objek*/= new mahasiswa04();  // instansiasi
        mhs1.nama = "Alfreda Dhaifullah Mahezwara";
        mhs1.nim = "244107020219";
        mhs1.kelas = "TI 1A";
        mhs1.ipk = 3.58;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("2.A");
        mhs1.updateIpk(3.75);
        mhs1.tampilkanInformasi();
        mhs1.nilaiKinerja();

        mahasiswa04 mhs2 = new mahasiswa04("Annisa Nabila", "2141720160",3.50, "TI 2L");
        mhs2.tampilkanInformasi();
        mhs2.updateIpk(3.55);
        mhs2.tampilkanInformasi();

        mahasiswa04 mhsAzril = new mahasiswa04("Azriel", "3425165", 2.95, "SIB 2A");
        mhsAzril.tampilkanInformasi();
    }
}
