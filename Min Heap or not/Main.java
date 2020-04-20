#include<iostream>
using namespace std;
int main()
{
  int n,a[100],f=1;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]<=a[i+1])
       continue;
    else 
    {
      f=0;
      break;
    }
  }
  if(f==0) cout<<"Given array is a min heap";
  else cout<<"Given array is not a min heap";
}