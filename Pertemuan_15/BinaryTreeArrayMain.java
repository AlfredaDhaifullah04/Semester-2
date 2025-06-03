package Pertemuan_15;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    BinarytreeArray04 bta = new BinarytreeArray04();

    Mahasiswa04 mhs1 = new Mahasiswa04("244160121", "All", "A", 3.57);
    Mahasiswa04 mhs2 = new Mahasiswa04("244160185", "Candra", "C", 3.41);
    Mahasiswa04 mhs3 = new Mahasiswa04("244160221", "Badar", "B", 3.75);
    Mahasiswa04 mhs4 = new Mahasiswa04("244160220", "Dewi", "B", 3.35);

    Mahasiswa04 mhs5 = new Mahasiswa04("244160131", "Dewi", "A", 3.48);
    Mahasiswa04 mhs6 = new Mahasiswa04("244160205", "Ehsan", "D", 3.61);
    Mahasiswa04 mhs7 = new Mahasiswa04("244160170", "Fizi", "B", 3.86);

    Mahasiswa04[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
    int idxLast = 6;
    bta.PopulateData(dataMahasiswas,idxLast);
    System.out.println("\nInorder Traversal Mahasiswa: ");bta.traverseInOrder(0);
    bta.traverseInOrder(0);
    
    }
}
