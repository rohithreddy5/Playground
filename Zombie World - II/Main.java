#include<iostream>
using namespace std;
int main()
{
  int b,n,a;
  cin>>b>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a;
    b = b - ((a % 2) + (a / 2));
   }

if(b>0) cout<<"YES";
else cout<<"NO";
}