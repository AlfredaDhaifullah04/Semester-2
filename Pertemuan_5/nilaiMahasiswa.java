package Pertemuan_5;

    public class nilaiMahasiswa {
        // Data nilai UTS dan UAS
        static int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        static int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        
        // mencari nilai UTS tertinggi dengan Divide and Conquer
        public static int UTStertinggi(int[] arr, int a, int l) {
            if (a == l) {
                return arr[a];
            }
            int mid = (a + l) / 2;
            int leftMax = UTStertinggi(arr, a, mid);
            int rightMax = UTStertinggi(arr, mid + 1, l);
            return leftMax + rightMax;
        }
        
        //mencari nilia UTS terendah dengan menggunakan Divide 
        public static int UTSterendah(int[] arr, int b, int c) {
            if (b == c) {
                return arr[b];
            }
            int mid = (b + c) / 2;
            int leftMin = UTSterendah(arr, b, mid);
            int rightMin = UTSterendah(arr, mid + 1, c);
            return Math.min(leftMin, rightMin);
        }
        
        // Brute Force untuk mencari rata-rata nilai UAS
        public static double RataUAS(int[] arr) {
            int total = 0;
            for (int i = 0; i < arr.length; i++ ) {
                total += arr[i];
            }
            return (double) total / arr.length;
        }
        
        public static void main(String[] args) {
            int maxUTS = UTStertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
            int minUTS = UTSterendah(nilaiUTS, 0, nilaiUTS.length - 1);
            double avgUAS = RataUAS(nilaiUAS);
            
            System.out.println("Nilai UTS Tertinggi: " + maxUTS);
            System.out.println("Nilai UTS Terendah: " + minUTS);
            System.out.println("Rata-rata Nilai UAS: " + avgUAS);
        }
    }
    

