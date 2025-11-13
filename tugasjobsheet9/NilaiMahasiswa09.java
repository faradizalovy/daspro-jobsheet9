package tugasjobsheet9;

import java.util.Scanner;
public class NilaiMahasiswa09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ":");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        double rata = total / (double) jumlah;
        System.out.println("\n==== HASIL DATA NILAI MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "=" +nilai[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Nilai tertinggi :" +tertinggi);
        System.out.println("Nilai terendah :" +terendah);
        System.out.println("Rata-rata nilai :" +rata);
    }
    
}
