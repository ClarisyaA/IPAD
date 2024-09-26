/*
Nama Program    : Tugas 4
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Selasa, 24 September 2024
Deskripsi       : Tentukan nilai akar dari polinom
                  P(x) = 4 - 3x + 5x2 -2x3 + x4 + 6x5 -2x6
                  Gunakan metode Newton Raphson dengan tebakan awal x0 = 1, 
                  dan lakukan sampai iterasi 3.
*/

#include <iostream>
using namespace std;

// Fungsi untuk menghitung nilai b (Horner's method)
void hitung_b(double a[], double b[], double x, int n) {
    b[n-1] = a[n-1];
    
    for (int i = n-2; i >= 0; i--) {
        b[i] = a[i] + b[i+1] * x;
    }
}

// Fungsi untuk menghitung nilai c (turunan pertama)
void hitung_c(double b[], double c[], double x, int n) {
    c[n-1] = b[n-1];
    
    for (int i = n-2; i > 0; i--) {
        c[i] = b[i] + c[i+1] * x;
    }
}

// Fungsi untuk menjalankan metode Newton-Raphson hingga 3 iterasi
void newton_raphson(double a[], double x0, int n, int iterasi_max) {
    double x = x0;
    double b[10];  // Array untuk menyimpan nilai b
    double c[10];  // Array untuk menyimpan nilai c

    cout << "\nTebakan awal (x0): " << x0 << endl << endl;

    for (int iterasi = 1; iterasi <= iterasi_max; iterasi++) {
        // Hitung b dan c
        hitung_b(a, b, x, n);
        hitung_c(b, c, x, n);
        
        // Output hasil per iterasi
        cout << "Iterasi " << iterasi << ":" << endl;
        cout << "  P(x" << iterasi-1 << ")  = " << b[0] << endl;
        cout << "  P'(x" << iterasi-1 << ") = " << c[1] << endl;

        // Gunakan rumus Newton-Raphson untuk menghitung x berikutnya
        double x_new = x - (b[0] / c[1]);
        cout << "  x" << iterasi << " = " << x_new << endl << endl;

        // Perbarui nilai x untuk iterasi berikutnya
        x = x_new;
    }
    
    cout << "Akar estimasi setelah 3 iterasi: " << x << endl << endl;
}

int main() {
    // Koefisien polinomial dari derajat 6
    double a[] = {4, -3, 5, -2, 1, 6, -2}; // P(x) = 4 - 3x + 5x^2 - 2x^3 + x^4 + 6x^5 - 2x^6
    int n = 7;
    // Nilai tebakan awal
    double x0 = 1.0;
    
    // Jumlah iterasi
    int iterasi_max = 3;
    
    // Jalankan metode Newton-Raphson
    newton_raphson(a, x0, n, iterasi_max);
}
