package Kuliah.Semester3.PBO.kelas.Petemuan5ril.tugas;

import java.util.Scanner;

class Koordinat {
    // Atribut absis (X) dan ordinat (Y)
    private float absis;
    private float ordinat;

    // Constructor untuk inisialisasi koordinat
    public Koordinat(float absis, float ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Getter dan Setter untuk absis dan ordinat
    public float getAbsis() {
        return absis;
    }

    public void setAbsis(float absis) {
        this.absis = absis;
    }

    public float getOrdinat() {
        return ordinat;
    }

    public void setOrdinat(float ordinat) {
        this.ordinat = ordinat;
    }

    // Metode untuk menampilkan koordinat
    public void output() {
        System.out.println("Koordinat Kartesian: (" + absis + ", " + ordinat + ")");
    }

    // Metode void untuk menghitung dan menampilkan titik tengah antara dua koordinat
    public void cariTitikTengahVoid(Koordinat p) {
        float tengahAbsis = (this.absis + p.getAbsis()) / 2;
        float tengahOrdinat = (this.ordinat + p.getOrdinat()) / 2;
        System.out.println("Titik tengah (void): (" + tengahAbsis + ", " + tengahOrdinat + ")");
    }

    // Metode untuk menghitung titik tengah dan mengembalikan koordinat
    public Koordinat cariTitikTengah(Koordinat p) {
        float tengahAbsis = (this.absis + p.getAbsis()) / 2;
        float tengahOrdinat = (this.ordinat + p.getOrdinat()) / 2;
        return new Koordinat(tengahAbsis, tengahOrdinat);
    }

    // Metode void untuk mencari dan menampilkan pencerminan terhadap sumbu X
    public void cerminTerhadapSumbuXVoid() {
        System.out.println("Pencerminan terhadap sumbu X (void): (" + this.absis + ", " + (-this.ordinat) + ")");
    }

    // Metode untuk mencari pencerminan terhadap sumbu Y dan mengembalikan koordinat
    public Koordinat cerminTerhadapSumbuY() {
        return new Koordinat(-this.absis, this.ordinat);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input koordinat A
        System.out.print("Masukkan absis A (X): ");
        float x1 = scanner.nextFloat();
        System.out.print("Masukkan ordinat A (Y): ");
        float y1 = scanner.nextFloat();
        Koordinat A = new Koordinat(x1, y1);

        // Input koordinat B
        System.out.print("Masukkan absis B (X): ");
        float x2 = scanner.nextFloat();
        System.out.print("Masukkan ordinat B (Y): ");
        float y2 = scanner.nextFloat();
        Koordinat B = new Koordinat(x2, y2);

        // Tampilkan koordinat A dan B
        System.out.println("\nKoordinat A:");
        A.output();
        System.out.println("Koordinat B:");
        B.output();

        // Menghitung dan menampilkan titik tengah (void)
        System.out.println("\nMenghitung titik tengah (void):");
        A.cariTitikTengahVoid(B);

        // Menghitung dan menampilkan titik tengah (fungsi)
        Koordinat titikTengah = A.cariTitikTengah(B);
        System.out.println("Titik tengah (fungsi):");
        titikTengah.output();

        // Pencerminan terhadap sumbu X (void)
        System.out.println("\nPencerminan A terhadap sumbu X (void):");
        A.cerminTerhadapSumbuXVoid();

        // Pencerminan terhadap sumbu Y (fungsi)
        System.out.println("Pencerminan A terhadap sumbu Y (fungsi):");
        Koordinat cerminY = A.cerminTerhadapSumbuY();
        cerminY.output();

        // Menutup Scanner
        scanner.close();
    }
}
