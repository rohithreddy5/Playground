#include<iostream>
using namespace std;
struct Node
{ 
	int data; 
	Node* next; 
}*newnode, *first, *last, *temp;
void insertion(int n)
{
	for(int i = 0; i < n; i++){
    	newnode = new Node();
    	cin>>newnode->data;
		if(first == NULL)
		{
	    	first = last = newnode;
		}
		else
		{
	    	last->next = newnode;
        	last=newnode;
		}
		last->next = NULL;
	}
}
int deletion(int n)
{
	int pos;
	cin>>pos;
    if(pos>n) 
    {
      cout<<"Please enter the correct position\n";
      cin>>pos;
    }
  	temp=first;
    if(pos==1) 
    {
      first=temp->next;
      
    }
   else
   {
     for(int i=1;i<pos-1&&temp!=NULL;i++)
     {
       temp=temp->next;
     }
     temp->next=(temp->next)->next;
   }
	
}
void display()
{
    temp = first;
    if(temp==NULL)
    {
        cout<<"No elements to display"<<endl;
    }
    else
    {
    	while(temp != NULL)
    	{
    	    cout<<temp->data<<"-->";
    	    temp=temp->next;
    	}
    	cout<<"NULL\n";
    }
}

int main() { 
  int n;
  cin>>n;
  insertion(n);
  display();
  deletion(n);
  display();
  return 0; 
}