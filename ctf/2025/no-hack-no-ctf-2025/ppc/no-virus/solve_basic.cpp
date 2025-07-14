#include <iostream>
#include <algorithm>
using namespace std;

int n, h, a, b;
long long viruses[105][3];
long long dp[105];

int main() {
    cin >> n >> h >> a >> b;
    
    for (int i = 0; i < n; i++) {
        cin >> viruses[i][0] >> viruses[i][1] >> viruses[i][2];
    }
    
    // 시간순 정렬
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j < n; j++) {
            if (viruses[i][0] > viruses[j][0]) {
                swap(viruses[i][0], viruses[j][0]);
                swap(viruses[i][1], viruses[j][1]);
                swap(viruses[i][2], viruses[j][2]);
            }
        }
    }
    
    // DP
    for (int i = n; i >= 0; i--) {
        dp[i] = 0;
    }
    
    for (int i = n-1; i >= 0; i--) {
        dp[i] = dp[i+1];
        
        long long energy = h;
        long long strength = 0;
        
        for (int j = i; j < n; j++) {
            if (energy >= viruses[j][1]) {
                energy -= viruses[j][1];
                strength += viruses[j][2];
                
                if (energy == 0) {
                    long long next_time = viruses[j][0] + a;
                    int k = j + 1;
                    while (k < n && viruses[k][0] < next_time) k++;
                    dp[i] = max(dp[i], strength + dp[k]);
                    break;
                } else {
                    long long next_time = viruses[j][0] + b;
                    int k = j + 1;
                    while (k < n && viruses[k][0] < next_time) k++;
                    dp[i] = max(dp[i], strength + dp[k]);
                }
            } else {
                long long next_time = viruses[j][0] + a;
                int k = j + 1;
                while (k < n && viruses[k][0] < next_time) k++;
                dp[i] = max(dp[i], strength + dp[k]);
                break;
            }
        }
        
        if (energy > 0) {
            dp[i] = max(dp[i], strength);
        }
    }
    
    cout << dp[0] << endl;
    
    return 0;
} 