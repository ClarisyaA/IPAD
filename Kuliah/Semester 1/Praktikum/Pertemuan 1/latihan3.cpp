/*
Nama Program : Latihan 3
Nama         : Clarisya Adeline
NPM          : 140810230017
Tanggal Buat : 9 feb 2024
Deskripsi    : BKang Acid ingin mengetahui berapa luas pizza yang dia dapatkan jika membeli pilihan pizza dengan jari-jari tertentu. Bantu Kang Acid menghitungnya!
*/

#include <iostream>
using namespace std;

int main(){
    float r;
    cin >> r;
    float phi = 3.14;
    float jariKuadrat = r*r;
    float luasLingkaran = phi*jariKuadrat;

    cout << "Luas Lingkaran: " << luasLingkaran<< endl;

}