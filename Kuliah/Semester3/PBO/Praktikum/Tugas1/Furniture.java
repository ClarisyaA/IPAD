package Kuliah.Semester3.PBO.Praktikum.Tugas1;

public class Furniture {
    private String nama;
    private int harga;
    private String warna;

    public Furniture(String nama, int harga, String warna) {
        this.nama = nama;
        this.harga = harga;
        this.warna = warna;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    public void tampilkanDeskripsi() {
        System.out.println("Ini adalah " + nama + " seharga Rp " + harga + " berwarna " + warna);
    }
}
