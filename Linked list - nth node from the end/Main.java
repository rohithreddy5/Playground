#include<iostream>
using namespace std;
int main()
{
  int a[100],k=0;
  while(1)
  {
    cin>>a[k];
    if(a[k]==-1) break;
    k++;
  }
  int n;
  cout<<"Enter the nth node:\n";
  cin>>n;
  if(k<n) cout<<"There is no nth node in the list\n";
  else cout<<a[k-n]<<" is the nth node element in the list\n";
  return 0;
}