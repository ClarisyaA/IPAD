/*
Nama Program    : Latihan 1
Nama            : Clarisya Adeline
NPM             : 140810230017
Tanggal         : Senin, 2 September 2024
Deskripsi       : Diketahui f(x) = sin(x). 
                  Tentukan nilai f(x) menggunakan deret taylor jika
 
                  x = 60°, a = 0, 
                  dan toleransi galat = 10^-6
*/

#include <iostream>
using namespace std;

// Fungsi untuk menghitung nilai sinus menggunakan deret Taylor
double hitung_sin(double x, double toleransi = 1e-6) {
    double suku = x; // suku pertama
    double hasil_sin = suku; // hasil awal sama dengan suku pertama
    int n = 1; // mulai dari suku pertama

    // Tampilkan hasil iterasi pertama
    cout << "Iterasi ke-1: " << hasil_sin << endl;

    // Lanjutkan menambah suku sampai nilai suku cukup kecil (lebih kecil dari toleransi)
    while ((suku >= toleransi || suku <= -toleransi) && n < 5) { // sampai iterasi ke-5
        suku *= -x * x / ((2 * n) * (2 * n + 1));
        hasil_sin += suku; // tambahkan suku berikutnya ke hasil
        n++; // lanjut ke suku berikutnya

        // Tampilkan hasil setiap iterasi
        cout << "Iterasi ke-" << n << ": " << hasil_sin << endl;
    }

    return hasil_sin; // kembalikan nilai akhir
}

int main() {
    double derajat = 60.0; // sudut dalam derajat
    double radian = derajat * 3.14159 / 180.0; // konversi derajat ke radian

    double hasil_sin = hitung_sin(radian); // hitung nilai sinus menggunakan deret Taylor
    double sin_sebenarnya = 0.866025; // nilai sin(60°) sebenarnya
    

    // Tampilkan galat absolut dan galat relatif
    cout << "Nilai sin(60°) sebenarnya: " << sin_sebenarnya << endl;
    cout << "Galat absolut: " << galat_absolut << endl;
    cout << "Galat relatif: " << galat_relatif << endl;

    return 0;
}
