/* Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima 
input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin 
dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil 
program: */

import java.util.Scanner;

public class modifikasiSearch2Nilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int n = sc.nextInt();


        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: " );
        int key = sc.nextInt();

        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (nilai[i] == key) {
                hasil = i+1;
                break;
            }
        }
        if (hasil != -1) {
        System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke- "+hasil);
        }
        sc.close();
    }
}
