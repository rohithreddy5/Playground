#include<iostream>
using namespace std;
int main()
{
  int n,a,b;
  cout<<"Enter number of nodes:\n";
  cin>>n;
  int mat[n][n];
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
      mat[i][j]=0;
    }
  }
  int count=0;
  while(1)
  {
    cin>>a>>b;
    mat[a][b]=1;
    count++;
    if(count==n+3) break;
  }
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
      cout<<mat[i][j]<<"  ";
    }
    cout<<"\n";
  }
  
}