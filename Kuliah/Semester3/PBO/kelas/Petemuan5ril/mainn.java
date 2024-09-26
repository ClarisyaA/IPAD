package Kuliah.Semester3.PBO.kelas.Petemuan5ril;

import java.util.Scanner;

class Koordinat {
    // Atribut absis (X) dan ordinat (Y) diubah menjadi float
    private float absis;
    private float ordinat;

    // Constructor default, menginisialisasi absis dan ordinat menjadi 0
    public Koordinat() {
        this.absis = 0;
        this.ordinat = 0;
    }

    // Constructor untuk inisialisasi koordinat dengan nilai yang diberikan
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

    // Metode untuk menghitung titik tengah antara dua koordinat
    public Koordinat cariTitikTengah(Koordinat p) {
        float tengahAbsis = (this.absis + p.getAbsis()) / 2;
        float tengahOrdinat = (this.ordinat + p.getOrdinat()) / 2;
        return new Koordinat(tengahAbsis, tengahOrdinat);
    }

    // Metode untuk mencari pencerminan terhadap sumbu X
    public Koordinat cerminTerhadapSumbuX() {
        return new Koordinat(this.absis, -this.ordinat);
    }

    // Metode untuk mencari pencerminan terhadap sumbu Y
    public Koordinat cerminTerhadapSumbuY() {
        return new Koordinat(-this.absis, this.ordinat);
    }
}

public class mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Koordinat A = new Koordinat(); // Koordinat A
        Koordinat B = new Koordinat(); // Koordinat B
        boolean running = true;

        // Menu utama
        while (running) {
            System.out.println("\n=== Menu Koordinat Kartesian ===");
            System.out.println("1. Input Koordinat A dan B");
            System.out.println("2. Tampilkan Titik Tengah A dan B");
            System.out.println("3. Pencerminan terhadap Sumbu X untuk A");
            System.out.println("4. Pencerminan terhadap Sumbu Y untuk A");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Input koordinat A
                    System.out.print("\nMasukkan absis A (X): ");
                    float x1 = input.nextFloat();
                    System.out.print("Masukkan ordinat A (Y): ");
                    float y1 = input.nextFloat();
                    A.setAbsis(x1);
                    A.setOrdinat(y1);

                    // Input koordinat B
                    System.out.print("\nMasukkan absis B (X): ");
                    float x2 = input.nextFloat();
                    System.out.print("Masukkan ordinat B (Y): ");
                    float y2 = input.nextFloat();
                    B.setAbsis(x2);
                    B.setOrdinat(y2);

                    System.out.println("\nKoordinat A dan B berhasil diinput.");
                    break;

                case 2:
                    // Menghitung dan menampilkan titik tengah
                    if (A.getAbsis() == 0 && A.getOrdinat() == 0 && B.getAbsis() == 0 && B.getOrdinat() == 0) {
                        System.out.println("\nAnda belum menginput koordinat A dan B.");
                    } else {
                        Koordinat titikTengah = A.cariTitikTengah(B);
                        System.out.println("\nTitik tengah antara A dan B:");
                        titikTengah.output();
                    }
                    break;

                case 3:
                    // Pencerminan terhadap sumbu X untuk A
                    Koordinat cerminX = A.cerminTerhadapSumbuX();
                    System.out.println("\nPencerminan A terhadap sumbu X:");
                    cerminX.output();
                    break;

                case 4:
                    // Pencerminan terhadap sumbu Y untuk A
                    Koordinat cerminY = A.cerminTerhadapSumbuY();
                    System.out.println("\nPencerminan A terhadap sumbu Y:");
                    cerminY.output();
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}
