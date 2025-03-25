package Pertemuan_6;

public class mahasiswaBerprestasi04 {
    mahasiswa04 [] listMhs;
    int jmldata;
    int idx;

    // konstruktor berparameter
    mahasiswaBerprestasi04 (int jmlData){
        jmldata = jmlData;
        listMhs = new mahasiswa04[jmldata];
    }

    // method tambah data
    void tambah (mahasiswa04 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // method tampil
    void Tampil () {
        for (mahasiswa04 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort () {
        for (int i = 0; i < listMhs.length-1;i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) { // tanda '>' untuk menentukan sorting ASC < atau DESC >
                    mahasiswa04 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void SelectionSort () {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa04 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void InsertionSort () {
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa04 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
