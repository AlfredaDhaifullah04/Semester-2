package Pertemuan_12;

public class SLLMain04 {
    public static void main(String[] args) {
        // Membuat objek SingleLinkedList
        SingleLindeklist04 linkedList = new SingleLindeklist04();

        // Membuat empat objek Mahasiswa
        Mahasiswa004 mhs1 = new Mahasiswa004("123", "Alice", "A", 3.8);
        Mahasiswa004 mhs2 = new Mahasiswa004("124", "Bob", "B", 3.5);
        Mahasiswa004 mhs3 = new Mahasiswa004("125", "Charlie", "C", 3.9);
        Mahasiswa004 mhs4 = new Mahasiswa004("126", "Diana", "D", 3.7);

        // Menambahkan data ke linked list dan mencetak perubahan
        System.out.println("Menambahkan data mhs1:");
        linkedList.addFirst(mhs1);
        linkedList.print();

        System.out.println("\nMenambahkan data mhs2:");
        linkedList.addLast(mhs2);
        linkedList.print();

        System.out.println("\nMenambahkan data mhs3 setelah mhs1:");
        linkedList.insertAfter("Alice", mhs3);
        linkedList.print();

        System.out.println("\nMenambahkan data mhs4 ke akhir:");
        linkedList.addLast(mhs4);
        linkedList.print();

        System.out.println("data index 1 : ");
        linkedList.getData(1);

        System.out.println("data mahasisma an Binon berada pada index : "+linkedList.indexOf("binon"));
        System.out.println();

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeAt(0);
        linkedList.print();

    }
}
