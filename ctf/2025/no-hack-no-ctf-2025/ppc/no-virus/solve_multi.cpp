#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;

const int MAXN = 105;
long long dp[MAXN];

struct Virus {
    long long t, d, s;
} viruses[MAXN];

bool cmp(const Virus& a, const Virus& b) {
    return a.t < b.t;
}

int main() {
    int n, h, a, b;
    
    while (scanf("%d", &n) == 1) {
        if (n == 0) {
            printf("0\n");
            continue;
        }
        
        scanf("%d %d %d", &h, &a, &b);
        
        for (int i = 0; i < n; i++) {
            scanf("%lld %lld %lld", &viruses[i].t, &viruses[i].d, &viruses[i].s);
        }
        
        sort(viruses, viruses + n, cmp);
        
        memset(dp, 0, sizeof(dp));
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1];
            
            long long energy = h;
            long long strength = 0;
            
            for (int j = i; j < n; j++) {
                if (energy >= viruses[j].d) {
                    energy -= viruses[j].d;
                    strength += viruses[j].s;
                    
                    if (energy == 0) {
                        long long next_time = viruses[j].t + a;
                        int k = j + 1;
                        while (k < n && viruses[k].t < next_time) k++;
                        dp[i] = max(dp[i], strength + dp[k]);
                        break;
                    } else {
                        long long next_time = viruses[j].t + b;
                        int k = j + 1;
                        while (k < n && viruses[k].t < next_time) k++;
                        dp[i] = max(dp[i], strength + dp[k]);
                    }
                } else {
                    long long next_time = viruses[j].t + a;
                    int k = j + 1;
                    while (k < n && viruses[k].t < next_time) k++;
                    dp[i] = max(dp[i], strength + dp[k]);
                    break;
                }
            }
            
            if (energy > 0) {
                dp[i] = max(dp[i], strength);
            }
        }
        
        printf("%lld\n", dp[0]);
    }
    
    return 0;
} 