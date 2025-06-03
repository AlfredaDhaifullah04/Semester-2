package Pertemuan_15;

public class BinarytreeArray04 {
    Mahasiswa04 [] dataMahasiswa;
    int idxLast;

    public BinarytreeArray04 () {
        this.dataMahasiswa = new Mahasiswa04[10];
    }

    void PopulateData (Mahasiswa04 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}
