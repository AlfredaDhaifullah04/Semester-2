package Pertemuan_6;

public class Sorting04 {
    int [] data;
    int jumData;

    // membuat method sorting - buble sort
    void bubbleSort () {
        int temp = 0;
        for (int i = 0; i < jumData -1; i++) {
            for (int k = 1; k < jumData -i; k++) {
                if (data[k-1] > data[k]) {
                    temp = data[k];
                    data[k] = data[k-1];
                    data[k-1] = temp;
                }
            }
        }
    }

    // membuat method sorting - Selection Sort
    void SelectionSort () {
        for (int i = 0; i < jumData-1; i++) {
            int min = i;
            for (int j = i+1; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data [i];
            data [i] = data[min];
            data[min] = temp;
        }
    }

    // membuat method Sorting - Insertion Sort 
    void InsertioinSort () {
        for (int i = 1; i <= data.length-1; i++) {
            int temp = data[i];
            int j = i-1;
            while (j >=0 && data[j] > temp) {
                data [j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }

    // method untuk menampilkan objek
    void tampil() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // konstruktor
    Sorting04 (int []Data, int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jmlData; i++) {
            data[i] = Data[i];
        }
    }
}

