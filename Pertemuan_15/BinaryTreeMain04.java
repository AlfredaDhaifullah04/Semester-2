package Pertemuan_15;

public class BinaryTreeMain04 {
    public static void main (String[] args) {
        BinaryTree04 bet = new BinaryTree04();

        bet.add(new Mahasiswa04("24416022","All","A", 3.57));
        bet.add(new Mahasiswa04("24416092","Reader","B", 3.85));
        bet.add(new Mahasiswa04("24416018","Cancer","C", 3.21));
        bet.add(new Mahasiswa04("24416020","Dowd","B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bet.traverseInOrder(bet.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk 3.54 : ");
        String hasilCari = bet.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk 3.22 : ");
        hasilCari = bet.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bet.add(new Mahasiswa04("24416013","Dowd","A",  3.72));
        bet.add(new Mahasiswa04("24416029","Reader","D",  3.27));
        bet.add(new Mahasiswa04("24416017","Fail","B",  3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bet.traverseInOrder(bet.root);
        System.out.println("\nPreOrder Traversal:");
        bet.traversePreOrder(bet.root);
        System.out.println("\nPostOrder Traversal:");
        bet.traversePostOrder(bet.root);

        System.out.println("\nPenghapusan data mahasiswa:");
        bet.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bet.traverseInOrder(bet.root);
    }
}
