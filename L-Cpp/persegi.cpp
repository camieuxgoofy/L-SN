#include <iostream>
 
using namespace std;
 
int main()
{
  cout << "##  Program C++ Persegi Bintang  ##" << endl;
  cout << "===================================" << endl;
  cout << endl;
 
  int besar_persegi,i,j;
 
  cout << "Input besar persegi: ";
  cin >> besar_persegi;
 
  cout << endl;
 
  for(i=1;i<=besar_persegi;i++) {
    for(j=1;j<=besar_persegi;j++) {
      cout << " *";
    }
    cout << endl;
  }
 
  return 0;
}