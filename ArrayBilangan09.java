public class ArrayBilangan09 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}

/*PERTANYAAN*/

/*1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. 
Apa yang terjadi? Mengapa bisa demikian?*/
/*Jawaban: Program akan eror pada bagian 5.0 dan 7.5 karena array bil bertipe int, sedangkan 
angka tersebut bertipe double (memiliki koma). Tipe data int hanya bisa menyimpan bilangan bulat,
bukan desimal. Nilai 12867 dan 2000000 tidak menimbulkan eror karena masih berada dalam rentang
integer di Java*/

/*2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus 
pada saat deklarasi array. */
/*Jawaban ada di file modifikasiArrayBil09.java */

/*3.  Ubah statement pada langkah No 4 menjadi seperti berikut*/
/*Jawaban ada di file modifikasiArrayBil09.java */

/*4.  Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran 
dari program? Mengapa demikian? */
/*Jawaban: Program tetap berjalan dengan benar,karena indeks terakhir array (bil[3])
masih dalam batas (0-3). Namun jika kondisi diubah menjadi i <= 4, maka akan terjadi
ArrayIndexOutOfBoundsException karena program mencoba mengakses bil[4] yang tidak ada
(hanya 4 elemen: indeks 0-3) */ 