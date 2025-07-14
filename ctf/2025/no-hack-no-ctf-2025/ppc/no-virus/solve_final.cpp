#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, h, a, b;
    cin >> n >> h >> a >> b;
    
    if (n == 0) {
        cout << 0 << endl;
        return 0;
    }
    
    vector<vector<long long> > viruses(n, vector<long long>(3));
    for (int i = 0; i < n; i++) {
        cin >> viruses[i][0] >> viruses[i][1] >> viruses[i][2];
    }
    
    sort(viruses.begin(), viruses.end());
    
    vector<long long> dp(n + 1, 0);
    
    // Bottom-up DP
    for (int i = n - 1; i >= 0; i--) {
        dp[i] = dp[i + 1]; // 건너뛰기
        
        // 현재 바이러스에서 세션 시작
        long long energy = h;
        long long strength = 0;
        
        for (int j = i; j < n; j++) {
            if (energy >= viruses[j][1]) {
                energy -= viruses[j][1];
                strength += viruses[j][2];
                
                if (energy == 0) {
                    // 강제 퇴장
                    long long next_time = viruses[j][0] + a;
                    int next_idx = j + 1;
                    while (next_idx < n && viruses[next_idx][0] < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                    break;
                } else {
                    // 자발적 퇴장 옵션
                    long long next_time = viruses[j][0] + b;
                    int next_idx = j + 1;
                    while (next_idx < n && viruses[next_idx][0] < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                }
            } else {
                // 에너지 부족으로 강제 퇴장
                long long next_time = viruses[j][0] + a;
                int next_idx = j + 1;
                while (next_idx < n && viruses[next_idx][0] < next_time) {
                    next_idx++;
                }
                dp[i] = max(dp[i], strength + dp[next_idx]);
                break;
            }
        }
        
        // 모든 바이러스 처리 완료
        if (energy > 0) {
            dp[i] = max(dp[i], strength);
        }
    }
    
    cout << dp[0] << endl;
    
    return 0;
} 