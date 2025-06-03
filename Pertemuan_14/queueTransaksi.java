package Pertemuan_14;

public class queueTransaksi {
    transaksiPengisian[] data;
    int front,rear,size,kapasitas;

    public queueTransaksi(int kapasitas) {
        this.kapasitas= kapasitas;
        data = new transaksiPengisian[kapasitas];
        front = rear = size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull(){
        return size==kapasitas;
    }
    public void enqueue(transaksiPengisian t){
        if(isFull()){
            System.out.println("riwayat transaksi penuh");
            return;
        }
        data[rear]=t;
        rear=(rear+1)%kapasitas;
        size++;
    }
    public void tampilkanRiwayat(){
        if(isEmpty()){
            System.out.println("belum ada transaksi");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        int index = front;
        for(int i=0;i<size;i++){
            data[index].tampilkanTransaksi();
            index=(index+1)%kapasitas;
        }
    }
}
