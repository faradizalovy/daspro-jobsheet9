/*Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan 
"Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. 
Contoh tampilan program sebagai berikut: */

import java.util.Scanner;

public class modifikasi3SearchArray09 {
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
        } else {
            System.out.println("Nilai yang diicari tidak ditemukan");
        }
        sc.close();
    }
}
