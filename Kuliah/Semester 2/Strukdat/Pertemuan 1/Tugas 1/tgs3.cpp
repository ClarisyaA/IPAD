/*  Nama program : Tugas 3
    Nama         : Clarisya Adeline
    NPM          : 140810230017
    Tanggal buat : Rabu, 28-2-2024
    Deskripsi    : Tentukan hasil program dan perlihatkan langkah-langkahnya
*/

#include <iostream>
using namespace std;

// Deklarasi fungsi 'fungsi' dengan tiga parameter
void fungsi(int a, int& b, int& c){ 
    // Mengubah nilai a dengan menambahkan 1, lalu nilai b = nilai a
    b = ++a; // a+=1, b = a
    
    // Mengubah nilai c dengan mengurangi 1 dari b, 
    // lalu hasilnya ditambahkan ke c
    c += --b; // b -=1, c = c + b 
    
    // Mengurangi nilai a sebesar 1
    a--; // a -= 1

    // Mencetak nilai a, b, dan c
    cout << a << " " << b << " " << c << endl;
}

int main(){
    // Deklarasi dan inisialisasi variabel a, c, b, dan y dengan nilai 2
    int a = 2, c = 2, b = 2, y = 2;

    // Memanggil fungsi 'fungsi' dengan nilai-nilai variabel c, a, dan b
    fungsi (c, a, b); 
    // a += 1 --> 3, b = a = 3
    // b -= 1 --> 2, c = 4
    // a -= 1 --> 2

    // a = 2; b = 2; c = 4

    // Mencetak nilai a, b, dan c setelah pemanggilan pertama fungsi 'fungsi'
    // c = a, a = b, b = c
    cout << a << " " << b << " " << c << endl;
    // a = 2, b = 4, c = 2

    // Memanggil fungsi 'fungsi' dengan nilai-nilai a+b, c, dan y
    fungsi(a + b, c, y);
    // a+b = a ; c = b ; y = c
    //fungsi (6, 2, 2)
    // a += 1 --> 7, b = a = 7
    // b -= 1 --> 6, c = 2 + 6 = 8
    // a -= 1 --> 6

    // a = 6, b = 6, c = 8

    // a = 2 ; c = 6 ; b = 4
    // Mencetak nilai a, b, dan c setelah pemanggilan kedua fungsi 'fungsi'
    cout << a << " " << b << " " << c << endl;
    //a = 2, b = 4, c = 6
}
