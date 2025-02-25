package Pertemuan_3;

public class MahasiswaDemo4copy {
    public static void main(String[]args) {
        Mahasiswa4[] arrayOfMahasiswa = new Mahasiswa4[3];

        arrayOfMahasiswa[0] = new Mahasiswa4();
        arrayOfMahasiswa[0].nim = "2441070202222";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB - 1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75 ;

        arrayOfMahasiswa[1] = new Mahasiswa4();
        arrayOfMahasiswa[1].nim = "2345324312";
        arrayOfMahasiswa[1].nama = "AHMAD NABIL AFGAREZA";
        arrayOfMahasiswa[1].kelas = "TI - 1A";
        arrayOfMahasiswa[1].ipk = (float) 3.94;

        arrayOfMahasiswa[2] = new Mahasiswa4();
        arrayOfMahasiswa[2].nim = "345874529";
        arrayOfMahasiswa[2].nama = "FAZEL PRIYONO";
        arrayOfMahasiswa[2].kelas = "TI - 1A";
        arrayOfMahasiswa[2].ipk = (float) 3.90;

        System.out.println("NIM      : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[0].ipk);
        System.out.println("-------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[1].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa[2].ipk);
        System.out.println("-------------------------------------");

    }
}
