/*
Nama Program : Perpotongan Garis dengan Sumbu X
Nama         : Clarisya Adeline
NPM          : 140810230017
Tanggal Buat : 9 feb 2024
Deskripsi    : Diketahui sebuah persamaan garis lurus y = mx + c. Tentukan pada x berapakah garis tersebut berpotongan dengan sumbu X!
*/

#include <iostream>
using namespace std;
//y = mx+c
//y = 2x+8
//x = -4

int main(){
    float m,c;
    cout <<"Masukkan Bilangan Real ke- 1 : ";
    cin >> m;
    cout << "Masukkan Bilangan Real ke-2 : ";
    cin >> c;

    float x = c/m*-1;
    cout << "Nilai x = " << x;

}