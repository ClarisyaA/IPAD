/*  Nama program : Tugas 1
    Nama         : Clarisya Adeline
    NPM          : 140810230017
    Tanggal buat : Rabu, 28-2-2024
    Deskripsi    : Membuat program mencari luas persegi panjang secara modular
*/

#include <iostream>
using namespace std;

// fungsi input sisi persegi panjang
void input(int& x, int& y){
    cout << "Panjang sisi = ";
    cin >> x;
    cout << "lebar sisi = ";
    cin >> y;
}
 
// fungsi perhitungan luas persegi panjang
void luasPersegiPanjang(int p, int l){
    int rumus = p*l; // panjang x lebar
    cout << "Luas Persegi Panjang = " << rumus << endl; // pemanggilan hasil perkalian
}

int main(){
    int p,l; // inialisasi variabel
    input(p,l); // pemanggilan fungsi input
    luasPersegiPanjang(p,l); // pemanggilan fungsi perhitungan

}