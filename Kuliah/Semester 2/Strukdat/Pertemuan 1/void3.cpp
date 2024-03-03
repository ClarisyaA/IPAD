#include <iostream>
using namespace std;

void fungsi (int c, int& d){//reference hanya boleh variabel
    c=2;
    d=c;
    cout << c << " " << d << endl;
}

int main(){
    int a =1, b= 1;
    cout << a << " " << b << endl;
    fungsi(a,b);
    cout << a << " " << b << endl;
}