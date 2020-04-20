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
  int value,pos;
  cout<<"Before inserting:\n";
  for(int i=0;i<k;i++) cout<<a[i]<<endl;
  cout<<"Enter the value and position\n";
  cin>>pos>>value;
  cout<<"After inserting:\n";
  for(int i=k+1; i>=pos; i--)
  {
            a[i] = a[i-1];
  }
   a[pos] =value;
   //k++; 
        for(int i=0; i<=k; i++)
        {
            cout<<a[i]<<endl;
        }
  return 0;
}