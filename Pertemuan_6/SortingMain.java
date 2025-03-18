package Pertemuan_6;

public class SortingMain {
    public static void main (String[] args) {
        int a[] = {20,10,2,7,12};
        Sorting04 dataUrut1 = new Sorting04(a, a.length);
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        int b[] = {30,20,2,8,14};
        Sorting04 dataUrut2 = new Sorting04(b,b.length);
        System.out.println("Data awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("data setelah diurutkan dengan SELECTION SORT 2");
        dataUrut2.tampil();

        int c[] = {40,10,4,9,3};
        Sorting04 dataUrut3 = new Sorting04(c, c.length);
        System.out.println("Data awal 3");
        dataUrut3.tampil();
        dataUrut3.InsertioinSort();
        System.out.println("Data setelah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();

    }
}
