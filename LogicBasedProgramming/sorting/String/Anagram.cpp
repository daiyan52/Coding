#include<iostream>
#include<string>
using namespace std;
bool isAnagram(string s1,string s2)
{
	int len1 = s1.length();
	int len2 = s2.length();
	if(len1!=len2)
	{
		return false;
	}
	sort(s1.begin(),s1.end());
	sort(s2.begin(),s2.end());
	cout<<s1<<". "<<s2<<endl;
	for(int i=0;i<len1;i++)
	{
		if(s1[i]!=s2[i])
		{
			return false;
		}
	}
	return true;
}
int main()
{
	string s1,s2;
	getline(cin,s1);
	getline(cin,s2);
	bool res = isAnagram(s1,s2);
	cout<<res<<endl;
}