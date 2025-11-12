/*1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) 
agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa 
yang memiliki lebih besar dari 70 (>70) */

import java.util.Scanner;

public class modifikasiArrayRata09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int lulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
        }
    }
        rata2 = total/nilaiMhs.length;
        System.out.println("\nTotal nilai= " +total);
        System.out.println("Rata-rata nilai nilai= " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus =" +lulus);

    }
}
    
