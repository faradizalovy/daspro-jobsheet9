/*2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga 
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan 
output seperti berikut ini:  */

import java.util.Scanner;

public class modifikasiArray2Rata09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();


        int[] nilaiMhs = new int[jumlah];
        int lulus = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;


        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +" : ");
            nilaiMhs[i] = sc.nextInt();
        
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
    }
        double rataLulus = lulus > 0 ? totalLulus / lulus : 0;
        double rataTidakLulus =  (jumlah - lulus) > 0 ? totalTidakLulus / (jumlah - lulus) : 0;

        System.out.println("\nRata-rata nilai mahasiswa yang lulus = " + rataLulus);
        System.out.println("\nRata-rata nilai mahasiswa yang tidak lulus = " + rataTidakLulus);

    }
}
    
