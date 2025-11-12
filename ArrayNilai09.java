import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai ke-"+i+":");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println("\nDaftar Nilai Mahasiswa (yang lebih dari 70):");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
            System.out.println("Nilai ke-"+i+" adalah "+nilaiAkhir[i]);
            }
        }
    }
}


/*PERTANYAAN*/

/*1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: */
/*Jawaban: Setelah program dijalankan, tidak terjadi perubahan pada hasil output.
Hal ini karena penggunaan nilaiAkhir.length memiliki fungsi yang sama dengan angka 10 pada 
perulangan sebelumnya, yaitu menentukan banyaknya pengulangan sesuai jumlah elemen dalam 
array nilaiAkhir. Namun, perbedaan utamanya adalah pada fleksibilitas program. Dengan menggunakan 
nilaiAkhir.length, program akan secara otomatis menyesuaikan jumlah perulangan jika jumlah elemen 
dalam array diubah, tanpa perlu mengedit batas perulangan secara manual.*/

/*2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?*/
/*Jawaban: Artinya, perulangan akan terus berjalan selama nilai i lebih kecil dari jumlah elemen array.
nilaiAkhir.length bernilai 10, jadi perulangan berjalan dari i = 0 hingga i = 9. */

/*3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan 
nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): */
/*Jawaban: Setelah semua nilai dimasukkan, program menampilkan judul Daftar Nilai Mahasiswa (yang lebih dari 70):,
lalu dijalankan lagi perulangan for untuk memeriksa setiap elemen array, di dalam perulangan terdapat pernyataan 
if (nilaiAkhir[i] > 70), hanya elemen yang nilainya lebih besar dari 70 yang akan ditampilkan di layar. Output 
akhir program hanya mencetak nilai-nilai mahasiswa yang lebih dari 70 beserta indeksnya. Nilai yang kurang dari 
atau sama dengan 70 tidak ditampilkan.*/

/*4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan 
menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut: */
/*Jawaban ada di file modifikasiArrayNilai09.java */