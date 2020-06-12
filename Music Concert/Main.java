#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i =0;i<n;i++)
    cin>>a[i];
  
  int m=0,f=0;
  for(int i =0;i<n;i++)
  {
  if(a[i]%2==0)
    f++;
    else
      m++;
  
  }
  
  cout<<m<<endl;
  cout<<f;
  
  return 0;
}