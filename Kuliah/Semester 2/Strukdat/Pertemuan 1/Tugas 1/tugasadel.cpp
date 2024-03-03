#include <iostream>
using namespace std;

void fungsi(int a, int &b, int &c){
    b = ++a ; 
    c += --b; // c = c + --b
    a--;
    cout << a << " " << b << " " << c << endl;
}

int main(){
    int a=2, c=2, b=2, y=2;
    fungsi (c,a,b);
    /*
    int a --> c (2), int b --> a (2), int c --> b (2)
    b = ++a (2) --> b = a = 3
    c = c + --b (4) --> c = 3 + 1 (hasil decrement b = 3) = 4
    a-- (3) --> a = 2

    &c = a = 2, a = b = 2, &b = c = 4
    output == 2 2 4
    */

    cout << a << " " << b << " " << c << endl;
    /*
    a == 2
    &b == 4
    &c == 2
    output == 2 4 2
    */

    fungsi (a + b,c,y);
    /*
    int a --> a+b (2+4=6), int b --> c (4), int c --> y (2)
    b = ++a (6) --> b = a = 7
    c = c + --b (4) --> c = 2 + 6 (hasil decrement b = 7) = 8
    a-- (7) --> 6

    a+b = a = 6, &c = b = 6, y = c = 8
    output == 6 6 8
    */

    cout << a << " " << b << " " << c << endl;
    /*
    a == 2
    &b == 4
    &c == 6
    output == 2 4 6
    */
}

/*
HASIL OUTPUT
2 2 4
2 4 2
6 6 8
2 4 6
*/