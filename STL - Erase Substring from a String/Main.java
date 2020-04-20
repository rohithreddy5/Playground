#include <iostream> 
#include <string> 
using namespace std; 
  
// Function to demo erase 
void eraseDemo(string str) 
{ 
    int a,b;
  cin>>a>>b;
  int d=b-a+1+1;
    str.erase(a,b); 
    cout << str; 
} 
  
// Driver code 
int main() 
{ 
    string str;
    getline(cin,str);
    eraseDemo(str); 
    return 0; 
} 