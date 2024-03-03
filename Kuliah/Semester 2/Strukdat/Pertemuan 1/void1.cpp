#include <iostream>
using namespace std;

void fungsi (int a, int& b){
    a=2;
    b=++a; // --> a++ (a+1), b = a
    // b = a++ --> b = a, a++ (a+1)
    cout << a << " " << b << endl;
}
// a++ ++a a+=1 a=a+1 (increment)
int main(){
    int a =1, b= 1;
    cout << a << " " << b << endl;
    fungsi(a,b);
    cout << a << " " << b << endl;
}