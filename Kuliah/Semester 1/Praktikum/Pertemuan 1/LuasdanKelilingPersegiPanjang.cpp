/*
Nama Program : Luas dan keliling Persegi Panjang
Nama         : Clarisya Adeline
NPM          : 140810230017
Tanggal Buat : 9 feb 2024
Deskripsi    : Buat program untuk mencari luas dan keliling persegi panjang!
*/

#include <iostream>
using namespace std;

int main(){
    int luas, keliling, a, b;
    cout << "Masukkan angka pertama : ";
    cin >> a;
    cout << "Masukkan angka kedua : ";
    cin >> b;

    luas = a*b;
    keliling = 2*(a+b);

    cout >> "Luas Persegi Panjang : " >> luas >> endl;
    cout >> "Keliling Persegi Panjang : " >> keliling >> endl;
    
}