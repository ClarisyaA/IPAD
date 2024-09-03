/*
Nama Program :Torema Chinese Remainder
Kelompok     :8
Nama         :Adelia Felisha Putri, Clarisya Adeline, Martha Meslina, Keyna Fatima A, Ammara Azwadiena Alfiantie
NPM          :140810230003, 140810230017, 140810230037, 140810230067, 140810230073
Tanggal Buat :25 Agustus 2024
Deskripsi    :Membuat program mencari PBB dan Invers Modulo
----------------------------------------------------------------------------*/

#include <iostream>
using namespace std;

void inputData(int &a1, int &m1, int &a2, int &m2, int &a3, int &m3)
{
    cout << "Masukkan bilangan pertama : ";
    cin >> a1;
    cout << "Masukkan modulo pertama : ";
    cin >> m1;
    cout << "Masukkan bilangan kedua : ";
    cin >> a2;
    cout << "Masukkan modulo kedua : ";
    cin >> m2;
    cout << "Masukkan bilangan ketiga : ";
    cin >> a3;
    cout << "Masukkan modulo ketiga : ";
    cin >> m3;
}

int hasilModulus(int m1, int m2, int m3)
{
    return m1 * m2 * m3;
}

void hasilM(int m1, int m2, int m3, int &mod1, int &mod2, int &mod3)
{
    int mod = hasilModulus(m1, m2, m3);
    mod1 = mod / m1;
    mod2 = mod / m2;
    mod3 = mod / m3;
}

int inversModulus(int a, int m)
{
    for (int x = 1; x < m; x++)
    {
        if ((a * x) % m == 1)
        {
            return x;
        }
    }
    return -1;
}

void hasilY(int m1, int m2, int m3, int mod1, int mod2, int mod3, int &y1, int &y2, int &y3)
{
    hasilM(m1, m2, m3, mod1, mod2, mod3);
    y1 = inversModulus(mod1, m1);
    y2 = inversModulus(mod2, m2);
    y3 = inversModulus(mod3, m3);
}

void hasilAkhir(int a1, int a2, int a3, int m1, int m2, int m3, int mod1, int mod2, int mod3, int y1, int y2, int y3, int &x)
{
    int modulus = hasilModulus(m1, m2, m3);
    hasilM(m1, m2, m3, mod1, mod2, mod3);
    hasilY(m1, m2, m3, mod1, mod2, mod3, y1, y2, y3);
    int hasil = (a1 * mod1 * y1) + (a2 * mod2 * y2) + (a3 * mod3 * y3);
    x = hasil % modulus;
    cout << "X = " << x << " (mod " << hasilModulus(m1, m2, m3) << ")" << endl;
}

void menu()
{
    int pilihan;
    int a1, a2, a3, m1, m2, m3, mod1, mod2, mod3, y1, y2, y3, x;
    cout << "Program dimulai..." << endl;

    do
    {
        cout << endl;
        cout << "Menu" << endl;
        cout << "1. Input Data" << endl;
        cout << "2. Hasil Modulus" << endl;
        cout << "3. Hasil  M1, M2, dan M3" << endl;
        cout << "4. Hasil y1, y2, dan y3" << endl;
        cout << "5. Hasil Akhir" << endl;
        cout << "6. Keluar" << endl;
        cout << "Pilihan : ";
        cin >> pilihan;

        switch (pilihan)
        {
        case 1:
            cout << "Memulai Proses Penginputan Data" << endl;
            inputData(a1, m1, a2, m2, a3, m3);
            cout << endl;
            cout << "Data yang diinput : " << endl;
            cout << "X = " << a1 << " (mod " << m1 << ")" << endl;
            cout << "X = " << a2 << " (mod " << m2 << ")" << endl;
            cout << "X = " << a3 << " (mod " << m3 << ")" << endl;
            break;
        case 2:
            cout << "Modulus : " << hasilModulus(m1, m2, m3) << endl;
            break;
        case 3:
            cout << "Hasil dari : " << endl;
            hasilM(m1, m2, m3, mod1, mod2, mod3);
            cout << "M1 = " << mod1 << endl;
            cout << "M2 = " << mod2 << endl;
            cout << "M3 = " << mod3 << endl;
            break;
        case 4:
            cout << "Hasil dari : " << endl;
            hasilY(m1, m2, m3, mod1, mod2, mod3, y1, y2, y3);
            cout << "y1 = " << y1 << endl;
            cout << "y2 = " << y2 << endl;
            cout << "y3 = " << y3 << endl;
            break;
        case 5:
            cout << "Solusi akhir dari sistem kekongruenan tersebut : " << endl;
            hasilAkhir(a1, a2, a3, m1, m2, m3, mod1, mod2, mod3, y1, y2, y3, x);
            break;
        case 6:
            cout << "Program selesai..." << endl;
            break;
        default:
            cout << "Masukkan pilihan yang sesuai!" << endl;
            break;
        }
    } while (pilihan != 6);
}

int main()
{
    menu();
    return 0;
}