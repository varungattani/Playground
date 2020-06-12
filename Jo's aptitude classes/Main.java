// C++ program to find GCD of two or 
// more numbers 
#include <bits/stdc++.h> 
using namespace std; 

// Function to return gcd of a and b 
int gcd(int a, int b) 
{ 
	if (a == 0) 
		return b; 
	return gcd(b % a, a); 
} 

// Function to find gcd of array of 
// numbers 
int findGCD(int arr[], int n) 
{ 
	int result = arr[0]; 
	for (int i = 1; i < n; i++) 
		result = gcd(arr[i], result); 

	return result; 
} 

// Driven code 
int main() 
{ 
	
	int arr[3]; 
	int ans;
	for(int i=0;i<3;i++)
	{
		cin>>arr[i];
	}
	cin>>ans;
	if(ans==findGCD(arr, 3))
	cout<<"Answer is correct.";
	else
	cout<<"Answer is wrong.";
	//cout << findGCD(arr, n) << endl; 
	return 0; 
} 
