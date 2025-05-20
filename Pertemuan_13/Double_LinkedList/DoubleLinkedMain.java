package Pertemuan_13.Double_LinkedList;

public class DoubleLinkedMain {
    public static void main(String[] args) throws Exception {

        //praktikum 1
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===================================");
        dll.clear();
        dll.print();
        System.out.println("size : " + dll.size());


        //Praktikum 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());


        //Praktikum 3
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        System.out.println("Data awala oada Linked list adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get(1));
    }
}