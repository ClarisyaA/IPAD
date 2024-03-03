/*
Nama Program : Berbagi Bebek
Nama         : Clarisya Adeline
NPM          : 140810230017
Tanggal Buat : 9 feb 2024
Deskripsi    : Pak Dengklek memiliki N ekor bebek. Ia ingin membagi-bagikan bebek-bebeknya tersebut sama rata kepada M orang temannya. Pak Dengklek juga menyadari bahwa bisa saja terdapat sisa bebek karena banyaknya bebek tidak habis dibagi banyaknya temannya.
Bantulah Pak Dengklek untuk menentukan berapa ekor bebek yang harus dia berikan kepada masing-masing temannya, dan berapa sisanya.
*/

#include <iostream>
using namespace std;

int main(){
    int N,M;
    cout << "Banyak Bebek: ";
    cin >> N;
    cout << "Jumlah Teman: ";
    cin >> M;

    int pembagian = N/M;
    int sisa = N%M;

    cout << "masing-masing " << pembagian << endl;
    cout << "bersisa " << sisa << endl;
}