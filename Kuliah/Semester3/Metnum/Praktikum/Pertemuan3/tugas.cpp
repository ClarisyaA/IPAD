/*
Nama Program    : Tugas 2
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Selasa, 10 September 2024
Deskripsi       : Program untuk menyelesaikan contoh soal metode Newton-Raphson
                  f(x) = x^2 + 17x - 4
                  x0 = 0, e = 10^-6 (galat)
                  Iterasi sebanyak 5 kali
*/

#include <iostream>
#include <cmath>  // Untuk fungsi abs() dan pow()
using namespace std;

// Fungsi f(x) = x^2 + 17x - 4
double f(double x) {
    return pow(x, 2) + 17 * x - 4;
}

// Turunan pertama f'(x) = 2x + 17
double turunan(double x) {
    return 2 * x + 17;
}

// Metode Newton-Raphson
void newtonRaphson(double x0, int iterasi) {
    double x1;
    
    for (int i = 1; i <= iterasi; i++) {
        x1 = x0 - f(x0) / turunan(x0);  // Rumus Newton-Raphson

        cout << "Iterasi ke-" << i << endl;
        cout << "x0 = " << x0 << endl;
        cout << "f(x0) = " << f(x0) << endl;
        cout << "f'(x0) = " << turunan(x0) << endl;
        cout << "x1 = " << x1 << endl;
        cout << "f(x1) = " << f(x1) << endl;
        cout << "-------------------------" << endl;

        // Jika nilai f(x1) mendekati 0 atau perbedaan x0 dan x1 sangat kecil, berhenti
        if (abs(f(x1)) < 1e-6) {
            cout << "f(x) sudah lebih kecil dari toleransi error 10^-6" << endl;
            cout << "Akar ditemukan pada x = " << x1 << " dengan f(x1) mendekati 0." << endl;
            break;
        }

        x0 = x1;  // Update x0 untuk iterasi berikutnya
    }
}

int main() {
    double x0;
    int iterasi;

    cout << "-------------------------\n";
    cout << "| f(x) = x^2 + 17x -4\t|" << endl;
    cout << "| Galat = 10^-6\t\t|" << endl;
    cout << "-------------------------\n";
    cout << "Masukkan nilai awal x0: "; cin >> x0;
    cout << "Masukkan jumlah iterasi: "; cin >> iterasi;

    cout << "\nMencari akar menggunakan metode Newton-Raphson:\n\n";
    newtonRaphson(x0, iterasi);

    return 0;
}
