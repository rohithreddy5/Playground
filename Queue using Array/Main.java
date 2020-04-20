#include<iostream>
#include<stdlib.h>
using namespace std;
void Insert();
void Delete();
void Display();
int queue[100], n = 100, front = - 1, rear = - 1,choice;
int main()
{
  
  while(1)
  {
    cin>>choice;
    switch(choice)
    {
      case 1:
        Insert();
        break;
      case 2:
        Delete();
        break;
      case 3:
        Display();
        break;
      case 4:
        exit(0);
      default:
        cout<<"Wrong choice";
    }
  }
  return 0;
}
void Insert() {
   int val;
   if (rear == n - 1)
      cout<<"Queue Overflow"<<endl;
   else {
      if (front == - 1)
      front = 0;
      cin>>val;
      rear++;
      queue[rear] = val;
   }
}
void Delete() {
   if (front == - 1 || front > rear) {
      cout<<"Queue Underflow ";
   return ;
   } else {
      cout<<"Element deleted from queue is : "<< queue[front] <<endl;
      front++;;
   }
}
void Display() {
   if (front == - 1)
   cout<<"Queue is empty"<<endl;
   else {
     
      for (int i = front; i <= rear; i++)
         cout<<queue[i]<<" ";
      cout<<endl;
   }
}