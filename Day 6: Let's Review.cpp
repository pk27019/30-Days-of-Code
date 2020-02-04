#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;
int main() 
{
    int n;
    cin>>n;
    string x[n];
    for(int i=0;i<n;i++)cin>>x[i];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<x[i].length();j++)
            if(j%2==0)cout<<x[i][j];
        cout<<" ";
        for(int j=0;j<x[i].length();j++)
            if(j%2!=0)cout<<x[i][j];
        cout<<endl;
    }
}
