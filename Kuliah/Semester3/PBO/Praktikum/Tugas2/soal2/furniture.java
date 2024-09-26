package Kuliah.Semester3.PBO.Praktikum.Tugas2.soal2;

public class furniture {
    private String nama;
    private int harga;
    private String warna;

    public furniture(String nama, int harga, String warna) {
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

    public void tampilkanDeskripsi(int nomor) {
        System.out.println("Perabotan ke - " + nomor);
        System.out.println("Nama : " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Warna: " + warna);
        System.out.println();
    }

    // public void tampilkanDeskripsi(int total) {
    //     for (int i = 1; i <= total; i++) {
    //         System.out.print("Barang ke - " +  i  + ": " + nama);
            
    //         System.out.print("Harga : " + harga);
            
    //         System.out.print("Warna : " + warna);
    //         System.out.println();
    //     }
    // }
}