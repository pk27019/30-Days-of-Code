#include <bits/stdc++.h>
using namespace std;
int main()
{
    int sum[16],times=0;
    for(int i=0;i<16;i++)sum[i]=0;
    vector<vector<int>> arr(6);
    for (int i = 0; i < 6; i++)
    {
        arr[i].resize(6);

        for (int j = 0; j < 6; j++)cin >> arr[i][j];
        

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }
    for(int i =0; i<4; i++)
        for(int j=0 ;j<4; j++)
        {
            sum[times]+=arr[i][j]+arr[2+i][j]+arr[i][j+1]+
            arr[i+1][1+j]+arr[2+i][j+1]+arr[i][j+2]+arr[2+i][j+2];
            times++;
        }
    int max = sum[0];
    for(int i=1; i<16;i++)if(sum[i]>max)max = sum[i];    
    cout<<max;
    
}
