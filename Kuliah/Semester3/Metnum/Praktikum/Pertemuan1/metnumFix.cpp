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
#include <iomanip>  // Untuk setprecision

using namespace std;

// Fungsi untuk menghitung nilai π
double hitungPi() {
    return 3.141592653589793;
}

// Fungsi untuk mengkonversi derajat ke radian
double derajatKeRadian(double derajat) {
    return derajat * (hitungPi() / 180.0);
}

// Fungsi untuk menghitung faktorial
double faktorial(int n) {
    double hasil = 1.0;
    for (int i = 1; i <= n; ++i) {
        hasil *= i;
    }
    return hasil;
}

// Fungsi untuk menghitung pangkat
double pangkat(double basis, int eksponen) {
    double hasil = 1.0;
    for (int i = 0; i < eksponen; ++i) {
        hasil *= basis;
    }
    return hasil;
}

// Fungsi untuk menghitung nilai mutlak
double mutlak(double nilai) {
    return (nilai < 0) ? -nilai : nilai;
}

// Fungsi untuk menghitung sinus menggunakan deret Taylor
double hitungSin(double x, double toleransi, int& iterasiTerakhir, double& galatRelatifIterasi) {
    double suku = x; 
    double hasilSin = suku;
    int n = 1;
    double hasilIterasiSebelumnya = hasilSin; // Inisialisasi dengan hasil iterasi pertama

    // Tampilkan hasil iterasi pertama
    cout << "Iterasi ke-1: " << hasilSin << endl;

    // Lanjutkan menambah suku sampai nilai suku lebih kecil dari toleransi atau iterasi ke-5
    while (mutlak(suku) > toleransi && n < 5) {
        suku *= -x * x / ((2 * n) * (2 * n + 1));
        hasilSin += suku;
        ++n;

        // Tampilkan hasil setiap iterasi
        cout << "Iterasi ke-" << n << ": " << hasilSin << endl;

        // Hitung galat relatif antar iterasi
        galatRelatifIterasi = (mutlak(hasilSin - hasilIterasiSebelumnya) / mutlak(hasilSin)) * 100.0;
        hasilIterasiSebelumnya = hasilSin;
    }

    iterasiTerakhir = n;  // Mengupdate iterasi terakhir dengan nilai n yang terakhir
    return hasilSin;
}

int main() {
    int derajat;
    double toleransi;

    // Minta input dari pengguna
    cout << "Masukkan sudut dalam derajat: ";
    cin >> derajat;

    cout << "Masukkan toleransi galat (contoh: 0.000001): ";
    cin >> toleransi;

    // Konversi derajat ke radian
    double x = derajatKeRadian(derajat);

    // Hitung nilai sinus menggunakan deret Taylor
    int iterasiTerakhir;
    double galatRelatifIterasi = 0.0; // Variabel untuk menyimpan galat relatif antar iterasi
    double hasilSin = hitungSin(x, toleransi, iterasiTerakhir, galatRelatifIterasi);

    cout << fixed << setprecision(6); // Format output dengan 6 desimal
    cout << "Nilai sin(" << derajat << " derajat) menggunakan deret Taylor (hingga iterasi ke-" << iterasiTerakhir << "): " << hasilSin << endl;
    
    cout << "Galat relatif antar iterasi: " << galatRelatifIterasi << "%" << endl; // Tampilkan sebagai persen

    return 0;
}
