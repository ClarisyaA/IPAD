/*
Nama Program    : soal 2.java
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : Program untuk membuat class Furniture dengan variabel nama, harga, dan warna.
                  Program juga menggunakan constructor, setter, dan getter.
*/

package Kuliah.Semester3.PBO.Praktikum.Tugas1;

class Furniture {
    // Variabel instance
    private String nama;
    private int harga;
    private String warna;

    // Constructor
    public Furniture(String nama, int harga, String warna) {
        this.nama = nama;
        this.harga = harga;
        this.warna = warna;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    // Method untuk menampilkan deskripsi furniture
    public void tampilkanDeskripsi() {
        System.out.println("Ini adalah " + nama + " seharga Rp " + harga + " berwarna " + warna);
    }
}

public class soal2 {
    public static void main(String[] args) {
        // Membuat objek furniture dengan nilai awal
        Furniture kursi = new Furniture("Kursi", 150000, "coklat");
        
        // Menampilkan deskripsi furniture
        kursi.tampilkanDeskripsi();
    }
}
