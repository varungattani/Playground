#include<iostream>
using namespace std;

int findGCD(int a, int b) {    //assume a is greater than b
   if(a == 0 || b == 0)
      return 0;    //as a and b are 0, the greatest divisior is also 0
   if(a==b)
      return b;    //when both numbers are same
   if(a>b)
      return findGCD(a-b, b);
   else
      return findGCD(a, b-a);
}

int main() {
   int a, b;
   cin >> a >> b;
   cout <<"G.C.D of " <<a<<" and "<<b<<" = " <<findGCD(a,b);
}