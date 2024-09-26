package Kuliah.Semester3.PBO.kelas.Petemuan5ril.tugas.ppt;

/*
 Nama Program   :Main.java
 Nama           :Clarisya Adeline
 NPM            :140810230017
 Kelas          :A
 Tanggal        :12 September 2024
 Deskripsi      :Koordinat kartesian dengan java, cpp dan python
                 T.titikTengah1(A,B)
                 T=B.titikTengah2(A)
                 C.cerminX(A)
                 D=A.cerminY()
*/

import java.util.Scanner;

class Koordinat {
    // Atribut 
    private float absis;
    private float ordinat;

    // Constructor default
    public Koordinat() {
        absis = 0;
        ordinat = 0;
    }

    public Koordinat(float absis, float ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void inputKoordinat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan absis: ");
        absis = input.nextFloat();
        System.out.print("Masukkan ordinat: ");
        ordinat = input.nextFloat();
    }

    public void setKoordinat(float pAbsis, float pOrdinat) {
        absis = pAbsis;
        ordinat = pOrdinat;
    }

    public void setAbsis(float absis) {
        this.absis = absis;
    }

    public void setOrdinat(float ordinat) {
        this.ordinat = ordinat;
    }

    // Output -----------------------------------------
    public void printKoordinat() {
        System.out.println("Nilai Absis = " + absis);
        System.out.println("Nilai Ordinat = " + ordinat);
    }

    public float getAbsis() {
        return absis;
    }

    public float getOrdinat() {
        return ordinat;
    }

    // Fungsi titik tengah dengan tipe void
    public void titikTengah(Koordinat P1, Koordinat P2) {
        this.absis = (P1.absis + P2.absis) / 2;
        this.ordinat = (P1.ordinat + P2.ordinat) / 2;
    }

    // Fungsi titik tengah dengan return Koordinat
    public Koordinat titikTengah(Koordinat P) {
        Koordinat pHasil = new Koordinat(); // temp
        pHasil.absis = (P.absis + this.absis) / 2;
        pHasil.ordinat = (P.ordinat + this.ordinat) / 2;
        return pHasil;
    }

    // Fungsi pencerminan terhadap sumbu X (void)
    public void cerminX() {
        this.ordinat = -this.ordinat;
    }

    // Fungsi pencerminan terhadap sumbu Y (return Koordinat)
    public Koordinat cerminY() {
        return new Koordinat(-this.absis, this.ordinat);
    }
}

public class Main {

    public static void main(String[] args) {
        Koordinat ttk1 = new Koordinat(2, 1);
        Koordinat ttk2 = new Koordinat();
        Koordinat ttk3 = new Koordinat();

        // Menampilkan Titik Pertama
        System.out.println("Titik Pertama");
        ttk1.printKoordinat();
        System.out.println();

        // Meminta input untuk Titik Kedua
        System.out.println("Titik Kedua");
        ttk2.inputKoordinat(); // Input dari pengguna
        ttk2.printKoordinat();
        System.out.println();

        // Mencari titik tengah (void)
        System.out.println("Titik Tengah Cara void");
        ttk3.titikTengah(ttk1, ttk2);
        ttk3.printKoordinat();
        System.out.println();

        // Mencari titik tengah (fungsi return)
        System.out.println("Titik Tengah Cara fungsi return");
        ttk3 = ttk2.titikTengah(ttk1);
        ttk3.printKoordinat();
        System.out.println();

        // Pencerminan terhadap sumbu X (void)
        System.out.println("Pencerminan sumbu X");
        ttk1.cerminX();
        ttk1.printKoordinat();
        System.out.println();

        // Pencerminan terhadap sumbu Y (return)
        System.out.println("Pencerminan sumbu Y");
        Koordinat cerminYResult = ttk1.cerminY();
        cerminYResult.printKoordinat();
        System.out.println();
    }
}
