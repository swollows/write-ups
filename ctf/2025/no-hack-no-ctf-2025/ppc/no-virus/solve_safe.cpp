#include <cstdio>
#include <algorithm>
using namespace std;

typedef long long ll;

const int MAXN = 1005;
ll viruses[MAXN][3];
ll virus_times[MAXN];
ll dp[MAXN];

int main() {
    int n, h, a, b;
    scanf("%d %d %d %d", &n, &h, &a, &b);
    
    if (n == 0) {
        printf("0\n");
        return 0;
    }
    
    for (int i = 0; i < n; i++) {
        scanf("%lld %lld %lld", &viruses[i][0], &viruses[i][1], &viruses[i][2]);
    }
    
    // 시간 순으로 정렬 (간단한 버블 소트)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (viruses[j][0] > viruses[j + 1][0]) {
                swap(viruses[j][0], viruses[j + 1][0]);
                swap(viruses[j][1], viruses[j + 1][1]);
                swap(viruses[j][2], viruses[j + 1][2]);
            }
        }
    }
    
    for (int i = 0; i < n; i++) {
        virus_times[i] = viruses[i][0];
    }
    
    // DP 초기화
    for (int i = 0; i <= n; i++) {
        dp[i] = 0;
    }
    
    // Bottom-up DP
    for (int i = n - 1; i >= 0; i--) {
        dp[i] = dp[i + 1]; // 건너뛰기
        
        // 현재 바이러스에서 세션 시작
        ll energy = h;
        ll strength = 0;
        
        for (int j = i; j < n; j++) {
            if (viruses[j][0] < viruses[i][0]) continue;
            
            if (energy >= viruses[j][1]) {
                energy -= viruses[j][1];
                strength += viruses[j][2];
                
                // 각 바이러스 처리 후의 상태 확인
                if (energy == 0) {
                    // 강제 퇴장
                    ll next_time = viruses[j][0] + a;
                    int next_idx = j + 1;
                    while (next_idx < n && virus_times[next_idx] < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                    break;
                } else {
                    // 자발적 퇴장 옵션
                    ll next_time = viruses[j][0] + b;
                    int next_idx = j + 1;
                    while (next_idx < n && virus_times[next_idx] < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                }
            } else {
                // 에너지 부족으로 강제 퇴장
                ll next_time = viruses[j][0] + a;
                int next_idx = j + 1;
                while (next_idx < n && virus_times[next_idx] < next_time) {
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
    
    printf("%lld\n", dp[0]);
    
    return 0;
} 