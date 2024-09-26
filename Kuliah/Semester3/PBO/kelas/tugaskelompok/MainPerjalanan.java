Soal 2
/* 
Nama      : Nazwa Nashatasya
NPM       : 140810230019
Kelas     : A
Tanggal   : Kamis, 19 September 2024
Deskripsi : Java
Buat program mencari lama perjalanan seseorang :
• Input tgl Berangkat, tgl kedatangan, jam berangkat, jam kedatangan
• Tanggal (tglhari, bulan, tahun)
• Waktu (jam, menit, detik)

Tampilan :
Berangkat 
• Tanggal       : 1
• Bulan         : 1
• Tahun         : 2023
• Jam           : 10
• Menit         : 10
• Detik         : 10
Kedatangan 
• Tanggal       : 3
• Bulan         : 1
• Tahun         : 2023
• Jam           : 9
• Menit         : 10
• Detik         : 10
Lama Perjalanan : 1 hari 23 Jam
*/

import java.util.Scanner;

class Perjalanan {
    // Variable instan / atribut 
    private int tglhari1, bulan1, tahun1, jam1, menit1, detik1;
    private int tglhari2, bulan2, tahun2, jam2, menit2, detik2;

    // Constructor tanpa argumen
    public Perjalanan() {    
        tglhari1 = 0;
        bulan1 = 0;
        tahun1 = 0;
        jam1 = 0;
        menit1 = 0;
        detik1 = 0;
        tglhari2 = 0;
        bulan2 = 0;
        tahun2 = 0;
        jam2 = 0;
        menit2 = 0;
        detik2 = 0;
    }

    // Constructor dengan argumen
    public Perjalanan(int tglhari1, int bulan1, int tahun1, int jam1, int menit1, int detik1, int tglhari2, int bulan2, int tahun2, int jam2, int menit2, int detik2) {                
        this.tglhari1 = tglhari1;
        this.bulan1 = bulan1;
        this.tahun1 = tahun1;
        this.jam1 = jam1;
        this.menit1 = menit1;
        this.detik1 = detik1;
        this.tglhari2 = tglhari2;
        this.bulan2 = bulan2;
        this.tahun2 = tahun2;
        this.jam2 = jam2;
        this.menit2 = menit2;
        this.detik2 = detik2;
    }

    // Setter untuk variabel tglhari1
    public void setTglHari1(int tglhari1) {          
        this.tglhari1 = tglhari1;
    }
    // Getter untuk variabel tglhari1
    public int getTglHari1() {                
        return tglhari1;
    }

    // Setter untuk variabel bulan1
    public void setBulan1(int bulan1) {          
        this.bulan1 = bulan1;
    }
    // Getter untuk variabel bulan1
    public int getBulan1() {                
        return bulan1;
    }

    // Setter untuk variabel tahun1
    public void setTahun1(int tahun1) {          
        this.tahun1 = tahun1;
    }
    // Getter untuk variabel tahun1
    public int getTahun1() {                
        return tahun1;
    }

    // Setter untuk variabel jam1
    public void setJam1(int jam1) {          
        this.jam1 = jam1;
    }
    // Getter untuk variabel jam1
    public int getJam1() {                
        return jam1;
    }

    // Setter untuk variabel menit1
    public void setMenit1(int menit1) {          
        this.menit1 = menit1;
    }
    // Getter untuk variabel menit1
    public int getMenit1() {                
        return menit1;
    }

    // Setter untuk variabel detik1
    public void setDetik1(int detik1) {          
        this.detik1 = detik1;
    }
    // Getter untuk variabel detik1
    public int getDetik1() {                
        return detik1;
    }

    // Setter untuk variabel tglhari2
    public void setTglHari2(int tglhari2) {          
        this.tglhari2 = tglhari2;
    }
    // Getter untuk variabel tglhari2
    public int getTglHari2() {                
        return tglhari2;
    }

    // Setter untuk variabel bulan2
    public void setBulan2(int bulan2) {          
        this.bulan2 = bulan2;
    }
    // Getter untuk variabel bulan2
    public int getBulan2() {                
        return bulan2;
    }

    // Setter untuk variabel tahun2
    public void setTahun2(int tahun2) {          
        this.tahun2 = tahun2;
    }
    // Getter untuk variabel tahun2
    public int getTahun2() {                
        return tahun2;
    }

    // Setter untuk variabel jam2
    public void setJam2(int jam2) {          
        this.jam2 = jam2;
    }
    // Getter untuk variabel jam2
    public int getJam2() {                
        return jam2;
    }

    // Setter untuk variabel menit2
    public void setMenit2(int menit2) {          
        this.menit2 = menit2;
    }
    // Getter untuk variabel menit2
    public int getMenit2() {                
        return menit2;
    }

    // Setter untuk variabel detik2
    public void setDetik2(int detik2) {          
        this.detik2 = detik2;
    }
    // Getter untuk variabel detik2
    public int getDetik2() {                
        return detik2;
    }

    // Fungsi untuk input data dari dalam class
    public void inputFaktorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("BERANGKAT");
        System.out.println(" Masukkan tanggal : ");
        this.tglhari1 = input.nextInt();
        System.out.println("Masukkan bulan : ");
        this.bulan1 = input.nextInt();
        System.out.println("Masukkan tahun : ");
        this.tahun1 = input.nextInt();
        System.out.println("Jam             : ");
        this.jam1 = input.nextInt();
        System.out.println("Menit           : ");
        this.menit1 = input.nextInt();
        System.out.println("Detik           : ");
        this.detik1 = input.nextInt();
        System.out.println("KEDATANGAN");
        System.out.println("Tanggal         : ");
        this.tglhari2 = input.nextInt();
        System.out.println("Bulan           : ");
        this.bulan2 = input.nextInt();
        System.out.println("Tahun           : ");
        this.tahun2 = input.nextInt();
        System.out.println("Jam             : ");
        this.jam2 = input.nextInt();
        System.out.println("Menit           : ");
        this.menit2 = input.nextInt();
        System.out.println("Detik           : ");
        this.detik2 = input.nextInt();
    }

    // Fungsi untuk selisih tanggal
    public int selisihTgl(int tglhari1, int bulan1, int tahun1, int tglhari2, int bulan2, int tahun2) {
        int hasil;
        return hasil;
    }

    // Fungsi untuk selisih waktu
    public int selisihWkt(int jam1, int menit1, int detik1, int jam2, int menit2, int detik2) {
        int hasil;
        return hasil;
    }

    // Fungsi untuk mencetak data dari dalam class
    public void cetak() {
        System.out.println("BERANGKAT");
        System.out.println("Tanggal         : " + this.tglhari1);
        System.out.println("Bulan           : " + this.bulan1);
        System.out.println("Tahun           : " + this.tahun1);
        System.out.println("Jam             : " + this.jam1);
        System.out.println("Menit           : " + this.menit1);
        System.out.println("Detik           : " + this.detik1);
        System.out.println("KEDATANGAN");
        System.out.println("Tanggal         : " + this.tglhari2);
        System.out.println("Bulan           : " + this.bulan2);
        System.out.println("Tahun           : " + this.tahun2);
        System.out.println("Jam             : " + this.jam2);
        System.out.println("Menit           : " + this.menit2);
        System.out.println("Detik           : " + this.detik2);

        int hasil1 = selisihTgl();
        int hasil2 = selisihWkt();
        System.out.println("Lama Perjalanan : " + hasil1 + " hari" + hasil2);
    }

}

// Class utama untuk menjalankan program
public class MainPerjalanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Perjalanan perjalanan1 = new Perjalanan();  // Membuat objek Perjalanan
        int pilihan;

        do {
            menu();
            System.out.print("Pilih opsi : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // INPUT BERANGKAT DAN KEDATANGAN
                    faktorial.input();
                    faktorial.cetak();

                    faktorial.setN(input("Masukkan nilai n : "));
                    cetakFaktorial(faktorial); 
                    break;
                case 2:
                    // OUTPUT BERANGKAT DAN KEDATANGAN
                    faktorial.input();
                    faktorial.cetak();

                    faktorial.setN(input("Masukkan nilai n : "));
                    faktorial.setR(input("Masukkan nilai r : "));
                    cetakKombinasi(faktorial); 
                    break;
                case 3:
                    // KELUAR
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 3);
    }

    // Fungsi input data dari luar class
    static int input(String pesan) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pesan);
        return scanner.nextInt();
    }

    // Fungsi untuk mencetak data dari luar class
    static void ceta() {
        int hasil = faktorial.hitungFaktorial(faktorial.getN());
        System.out.println("Nilai faktorial dari " + faktorial.getN() + " adalah : " + hasilFaktorial);
    }

    // Fungsi untuk menampilkan menu
    static void menu() {
        System.out.println("");
        System.out.println("MENU:");
        System.out.println("1. Input Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Keluar");
    }
    
    
}