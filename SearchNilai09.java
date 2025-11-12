public class SearchNilai09 {
    public static void main(String[] args) {
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
         System.out.println();
         System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        System.out.println();
        }
}

/*PERTANYAAN */

/*1.  Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas. */
/*Jawaban: break berfungsi untuk menghentikan perulangan secara langsung ketika nilai yang dicari sudah ditemukan. 
tanpa break, perulangan akan tetap berjalan hingga akhir meskipun hasilnya sudah ditemukan */

/*2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen
array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari 
nilai (key) yang dicari. Contoh hasil program: */
/*Jawaban ada di file modifikasiSearch2Nilai09.java */

/*3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak 
ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut:  */
/*Jawaban ada di file modifikasiSearch3Nilai09.java*/