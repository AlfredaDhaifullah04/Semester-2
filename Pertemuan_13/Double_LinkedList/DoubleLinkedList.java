package Pertemuan_13.Double_LinkedList;

import java.io.EOFException;

public class DoubleLinkedList {
    Node004 head;
    int size;

    public DoubleLinkedList () {
        head = null;
        size = 0;
    }

    public boolean isEmpty () {
        return head == null;
    }
    
    // Menthod untuk penambahkan data di bagian depan LinkedList
    public void addFirst (int item) {
        if (isEmpty()) {
            head = new Node004(null, item, null);
        } else {
            Node004 newNode = new Node004(head, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Menthod untuk menambahkan data pada bagian belakang LinkedList
    public void addLast (int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node004 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node004 newNode = new Node004(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    //menthod untuk menambahkan data pada posisi yang telah ditentukan dengan indeks
    public void add (int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node004 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node004 newNode = new Node004(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node004 newNode = new Node004(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public int size () {
        return size;
    }

    //method untuk menghapus semua isi linked List
    public void clear() {
        head = null;
        size = 0;
    }

    public void print () {
        if (!isEmpty()) {
            Node004 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\n berhasi diisi");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    // Method untuk menghapus bagian depan
    public void removeFirst () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked lisr masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //Method untuk menghapus dari belakang
    public void removeLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node004 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // method untuk menghapus data pada index yang telah ditentukan
    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node004 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    // mehtod untuk mendapatkan data pada awal Linked List
    public int getFirst () throws Exception {
        if (isEmpty()) {
            throw new Exception(" Linked list kosong");
        }
        return head.data;
    }

    // Method untuk mendapatkan data pada akhir Linked List
    public int getLast () throws Exception {
        if (isEmpty()) {
            throw new Exception("linked list masih kosong");
        }
        Node004 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }  

    // method untuk mendapatkan data pada indeks yang telah ditentukan
    public int get (int indeks) throws Exception {
        if (isEmpty() || indeks >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node004 tmp = head; 
        for (int i = 0; i < indeks; i++) {
            tmp = tmp.next;
        }
        return tmp.data;

    }
} 
