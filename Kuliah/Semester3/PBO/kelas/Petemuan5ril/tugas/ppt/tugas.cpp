#include <iostream>
using namespace std;

/*
 Nama Program   : Koordinat.cpp
 Nama           : Clarisya Adeline
 NPM            : 140810230017
 Kelas          : A
 Tanggal        : 12 September 2024
 Deskripsi      : Koordinat kartesian dengan Java, C++, dan Python.
                 Metode untuk mencari titik tengah dan pencerminan koordinat.
*/

class Koordinat {
private:
    float absis;   // Atribut untuk nilai absis (X)
    float ordinat; // Atribut untuk nilai ordinat (Y)

public:
    // Constructor default
    Koordinat() {
        absis = 0;
        ordinat = 0;
    }

    // Constructor dengan parameter untuk inisialisasi
    Koordinat(float absis, float ordinat) {
        this->absis = absis;
        this->ordinat = ordinat;
    }

    // Getter untuk absis
    float getAbsis() const {
        return absis;
    }

    // Setter untuk absis
    void setAbsis(float absis) {
        this->absis = absis;
    }

    // Getter untuk ordinat
    float getOrdinat() const {
        return ordinat;
    }

    // Setter untuk ordinat
    void setOrdinat(float ordinat) {
        this->ordinat = ordinat;
    }

    // Metode untuk memasukkan koordinat
    void inputKoordinat() {
        cout << "Masukkan absis: ";
        cin >> absis;
        cout << "Masukkan ordinat: ";
        cin >> ordinat;
    }

    // Metode untuk menetapkan koordinat
    void setKoordinat(float absis, float ordinat) {
        this->absis = absis;  
        this->ordinat = ordinat; 
    }

    // Metode untuk menampilkan koordinat
    void printKoordinat() const {
        cout << "Nilai Absis = " << absis << endl;
        cout << "Nilai Ordinat = " << ordinat << endl;
    }

    // Metode untuk mencari titik tengah (void)
    void titikTengah(Koordinat P1, Koordinat P2) {
        absis = (P1.absis + P2.absis) / 2; // Menghitung absis titik tengah
        ordinat = (P1.ordinat + P2.ordinat) / 2; // Menghitung ordinat titik tengah
    }

    // Metode untuk mencari titik tengah (return)
    Koordinat titikTengah(Koordinat P) const {
        return Koordinat((P.absis + absis) / 2, (P.ordinat + ordinat) / 2);
    }

    // Metode untuk pencerminan terhadap sumbu X
    void cerminX() {
        ordinat = -ordinat; // Mengubah ordinat menjadi negatif
    }

    // Metode untuk pencerminan terhadap sumbu Y (return)
    Koordinat cerminY() const {
        return Koordinat(-absis, ordinat); // Mengembalikan objek baru dengan absis negatif dan ordinat tetap
    }
};

int main() {
    Koordinat ttk1(2, 1); // Membuat objek ttk1 dengan koordinat (2, 1)
    Koordinat ttk2;       // Membuat objek ttk2 tanpa inisialisasi
    Koordinat ttk3;       // Objek untuk titik tengah (return)
    Koordinat ttk4;       // Objek untuk pencerminan

    // Menampilkan Titik Pertama
    cout << "Titik Pertama" << endl;
    ttk1.printKoordinat();
    cout << endl;

    // Menampilkan Titik Kedua
    cout << "Titik Kedua" << endl;
    ttk2.setKoordinat(6, 3); // Mengatur koordinat ttk2 menjadi (6, 3)
    ttk2.printKoordinat();
    cout << endl;

    // Mencari titik tengah (void)
    cout << "Titik Tengah Cara void" << endl;
    ttk3.titikTengah(ttk1, ttk2); // Menghitung titik tengah dari ttk1 dan ttk2
    ttk3.printKoordinat();
    cout << endl;

    // Mencari titik tengah (fungsi return)
    cout << "Titik Tengah Cara fungsi return" << endl;
    ttk3 = ttk2.titikTengah(ttk1); // Menggunakan metode return untuk mendapatkan titik tengah
    ttk3.printKoordinat();
    cout << endl;

    cout << "---------------------------" << endl;
    cout << "Titik untuk dicerminkan" << endl;
    ttk4.inputKoordinat(); // Memasukkan koordinat untuk pencerminan
    ttk4.printKoordinat();
    cout << endl;

    // Pencerminan terhadap sumbu Y (return)
    cout << "Pencerminan sumbu Y" << endl;
    Koordinat cerminYResult = ttk4.cerminY(); // Mendapatkan hasil pencerminan terhadap sumbu Y
    cerminYResult.printKoordinat();
    cout << endl;

    // Pencerminan terhadap sumbu X (void)
    cout << "Pencerminan sumbu X" << endl;
    ttk4.cerminX(); // Mencerminkan ttk4 terhadap sumbu X
    ttk4.printKoordinat();
    cout << endl;

}
