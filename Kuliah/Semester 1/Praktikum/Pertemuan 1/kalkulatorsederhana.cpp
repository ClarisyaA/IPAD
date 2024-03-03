/*
Nama Program : Kalkulator Sederhana
Nama         : Clarisya Adeline
NPM          : 140810230017
Tanggal Buat : 9 feb 2024
Deskripsi    : Buat kalkulator sederhana yang dapat digunakan untuk menjumlah, mengurang, mengali, membagi 2 buah input.
*/

#include <iostream>
using namespace std;

int main(){
    int A, B, Penjumlahan, Pengurangan, Perkalian, Pembagian;
    cout << "Bilangan Pertama : ";
    cin >> A;
    cout << "Bilangan Kedua : ";
    cin >> B;
    Penjumlahan = A+B;
    Pengurangan = A-B;
    Perkalian = A*B;
    Pembagian = A/B;

    cout << "Hasil Penjumlahan : " << Penjumlahan << endl;
    cout << "Hasil Pengurangan : " << Pengurangan << endl;
    cout << "Hasil Perkalian : " << Perkalian << endl;
    cout << "Hasil Pembagian : " << Pembagian << endl;
}