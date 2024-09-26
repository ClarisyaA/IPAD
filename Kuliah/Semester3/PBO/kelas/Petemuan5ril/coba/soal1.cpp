#include <iostream>

using namespace std;

class Koordinat {
private:
    float absis;
    float ordinat;

public:
    // Default constructor
    Koordinat() : absis(0), ordinat(0) {}

    Koordinat(float absis, float ordinat) : absis(absis), ordinat(ordinat) {}

    void inputKoordinat() {
        cout << "Masukkan absis: ";
        cin >> absis;
        cout << "Masukkan ordinat: ";
        cin >> ordinat;
    }

    void setKoordinat(float pAbsis, float pOrdinat) {
        absis = pAbsis;
        ordinat = pOrdinat;
    }

    void printKoordinat() {
        cout << "Nilai Absis = " << absis << endl;
        cout << "Nilai Ordinat = " << ordinat << endl;
    }

    float getAbsis() { return absis; }
    float getOrdinat() { return ordinat; }

    // Function to find midpoint using void
    void titikTengah(const Koordinat& P1, const Koordinat& P2) {
        absis = (P1.absis + P2.absis) / 2;
        ordinat = (P1.ordinat + P2.ordinat) / 2;
    }

    // Function to find midpoint returning Koordinat
    Koordinat titikTengah(const Koordinat& P) {
        return Koordinat((P.absis + absis) / 2, (P.ordinat + ordinat) / 2);
    }

    // Function to reflect over X-axis (void)
    void cerminX() {
        ordinat = -ordinat;
    }

    // Function to reflect over Y-axis (return Koordinat)
    Koordinat cerminY() {
        return Koordinat(-absis, ordinat);
    }
};

int main() {
    Koordinat ttk1(2, 1);
    Koordinat ttk2;
    Koordinat ttk3;

    // Display first point
    cout << "Titik Pertama" << endl;
    ttk1.printKoordinat();
    cout << endl;

    // Get input for second point
    cout << "Titik Kedua" << endl;
    ttk2.inputKoordinat();
    ttk2.printKoordinat();
    cout << endl;

    // Finding midpoint (void)
    cout << "Titik Tengah Cara void" << endl;
    ttk3.titikTengah(ttk1, ttk2);
    ttk3.printKoordinat();
    cout << endl;

    // Finding midpoint (function return)
    cout << "Titik Tengah Cara fungsi return" << endl;
    ttk3 = ttk2.titikTengah(ttk1);
    ttk3.printKoordinat();
    cout << endl;

    // Reflect over X-axis (void)
    cout << "Pencerminan sumbu X" << endl;
    ttk1.cerminX();
    ttk1.printKoordinat();
    cout << endl;

    // Reflect over Y-axis (return)
    cout << "Pencerminan sumbu Y" << endl;
    Koordinat cerminYResult = ttk1.cerminY();
    cerminYResult.printKoordinat();
    cout << endl;

    return 0;
}
