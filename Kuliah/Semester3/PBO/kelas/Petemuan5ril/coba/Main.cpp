#include <iostream>

using namespace std;

class Koordinat {
private:
    // Atribut absis (X) dan ordinat (Y)
    float absis;
    float ordinat;

public:
    // Constructor default, menginisialisasi absis dan ordinat menjadi 0
    Koordinat() {
        absis = 0;
        ordinat = 0;
    }

    // Constructor untuk inisialisasi koordinat dengan nilai yang diberikan
    Koordinat(float absis, float ordinat) {
        this->absis = absis;
        this->ordinat = ordinat;
    }

    // Getter dan Setter untuk absis dan ordinat
    float getAbsis() const {
        return absis;
    }

    void setAbsis(float absis) {
        this->absis = absis;
    }

    float getOrdinat() const {
        return ordinat;
    }

    void setOrdinat(float ordinat) {
        this->ordinat = ordinat;
    }

    // Metode untuk menampilkan koordinat
    void output() const {
        cout << "Koordinat Kartesian: (" << absis << ", " << ordinat << ")" << endl;
    }

    // Metode untuk menghitung titik tengah antara dua koordinat
    Koordinat cariTitikTengah(const Koordinat& p) const {
        float tengahAbsis = (this->absis + p.getAbsis()) / 2;
        float tengahOrdinat = (this->ordinat + p.getOrdinat()) / 2;
        return Koordinat(tengahAbsis, tengahOrdinat);
    }

    // Metode void untuk menghitung dan menampilkan titik tengah antara dua koordinat
    void cariTitikTengahVoid(const Koordinat& p) const {
        float tengahAbsis = (this->absis + p.getAbsis()) / 2;
        float tengahOrdinat = (this->ordinat + p.getOrdinat()) / 2;
        cout << "Titik tengah (void): (" << tengahAbsis << ", " << tengahOrdinat << ")" << endl;
    }

    // Metode untuk mencari pencerminan terhadap sumbu X
    Koordinat cerminTerhadapSumbuX() const {
        return Koordinat(this->absis, -this->ordinat);
    }

    // Metode untuk mencari pencerminan terhadap sumbu Y
    Koordinat cerminTerhadapSumbuY() const {
        return Koordinat(-this->absis, this->ordinat);
    }
};

int main() {
    Koordinat A; // Koordinat A
    Koordinat B; // Koordinat B
    bool running = true;

    // Menu utama
    while (running) {
        cout << "\n=== Menu Koordinat Kartesian ===" << endl;
        cout << "1. Input Koordinat A dan B" << endl;
        cout << "2. Tampilkan Titik Tengah A dan B" << endl;
        cout << "3. Pencerminan terhadap Sumbu X untuk A" << endl;
        cout << "4. Pencerminan terhadap Sumbu Y untuk A" << endl;
        cout << "5. Keluar" << endl;
        cout << "Pilih menu: ";
        int pilihan;
        cin >> pilihan;

        switch (pilihan) {
            case 1: {
                // Input koordinat A
                float x1, y1, x2, y2;
                cout << "\nMasukkan absis A (X): ";
                cin >> x1;
                cout << "Masukkan ordinat A (Y): ";
                cin >> y1;
                A.setAbsis(x1);
                A.setOrdinat(y1);

                // Input koordinat B
                cout << "\nMasukkan absis B (X): ";
                cin >> x2;
                cout << "Masukkan ordinat B (Y): ";
                cin >> y2;
                B.setAbsis(x2);
                B.setOrdinat(y2);

                cout << "\nKoordinat A dan B berhasil diinput." << endl;
                break;
            }
            case 2: {
                // Menghitung dan menampilkan titik tengah
                if (A.getAbsis() == 0 && A.getOrdinat() == 0 && B.getAbsis() == 0 && B.getOrdinat() == 0) {
                    cout << "\nAnda belum menginput koordinat A dan B." << endl;
                } else {
                    Koordinat titikTengah = A.cariTitikTengah(B);
                    cout << "\nTitik tengah antara A dan B:" << endl;
                    titikTengah.output();
                }
                break;
            }
            case 3: {
                // Pencerminan terhadap sumbu X untuk A
                Koordinat cerminX = A.cerminTerhadapSumbuX();
                cout << "\nPencerminan A terhadap sumbu X:" << endl;
                cerminX.output();
                break;
            }
            case 4: {
                // Pencerminan terhadap sumbu Y untuk A
                Koordinat cerminY = A.cerminTerhadapSumbuY();
                cout << "\nPencerminan A terhadap sumbu Y:" << endl;
                cerminY.output();
                break;
            }
            case 5:
                // Keluar dari program
                cout << "Keluar dari program." << endl;
                running = false;
                break;

            default:
                cout << "Pilihan tidak valid. Silakan pilih lagi." << endl;
                break;
        }
    }

    return 0;
}
