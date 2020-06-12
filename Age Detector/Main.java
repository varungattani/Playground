#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  b=b+100;
  int ans;
  ans=b-a;
  if(ans<100)
    cout<<ans;
  else
    cout<<ans%100;
}