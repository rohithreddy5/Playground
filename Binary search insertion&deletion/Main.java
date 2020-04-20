#include<iostream>
using namespace std;
int main()
{
  int n,a[100];
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int k;
  cin>>k;
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
  }
  cout<<"Inorder traversal of the BST : ";
  for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
  cout<<"\n";
  cout<<"deletion : ";
  int index;
  for(int i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      index=i;
      break;
    }
  }
  for(int i=0;i<index;i++)
    cout<<a[i]<<" ";
  for(int i=index+1;i<n;i++)
    cout<<a[i]<<" ";
}