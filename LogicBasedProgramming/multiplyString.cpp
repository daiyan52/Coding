#include<iostream>
using namespace std;
string multiplyString(string s1,string s2)
{
	int  n1 = int(s1[0]);
	int n2 = int(s2[0]);
	return n1*n2;
}
int main()
{
	string s1,s2;
	getline(cin,s1);
	getline(cin,s2);
	int res = multiplyString(s1,s2);
	cout<<res;
}