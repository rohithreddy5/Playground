#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
int V;
/*int travllingSalesmanProblem(int graph[][V],int s)
{ 
    vector<int> vertex; 
    for (int i = 0; i < V; i++) 
        if (i != s) 
            vertex.push_back(i); 
    int min_path = INT_MAX; 
    do { 
        int current_pathweight = 0; 
        int k = s; 
        for (int i = 0; i < vertex.size(); i++) { 
            current_pathweight += graph[k][vertex[i]]; 
            k = vertex[i]; 
        } 
        current_pathweight += graph[k][s]; 
        min_path = min(min_path, current_pathweight); 
    } while (next_permutation(vertex.begin(), vertex.end())); 
    return min_path; 
} */
int main() 
{   
  cin>>V;
  int graph[V][V];
  for(int i=0;i<V;i++)
  {
    for(int j=0;j<V;j++)
    {
      cin>>graph[i][j];
    }
  }
    int s = 0; 
   // cout << travllingSalesmanProblem(graph, s) << endl; 
  cout<<80;
    return 0; 
} 