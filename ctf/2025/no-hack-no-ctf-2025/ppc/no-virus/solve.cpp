#include <cstdio>
#include <algorithm>
#include <cstring>
using namespace std;

const int MAXN = 10005;
long long dp[MAXN];

struct Virus {
    long long t, d, s;
    bool operator<(const Virus& other) const {
        return t < other.t;
    }
} viruses[MAXN];

int main() {
    int n, h, a, b;
    if (scanf("%d %d %d %d", &n, &h, &a, &b) != 4) {
        return 0;
    }
    
    if (n <= 0 || n > 10000) {
        printf("0\n");
        return 0;
    }
    
    for (int i = 0; i < n; i++) {
        if (scanf("%lld %lld %lld", &viruses[i].t, &viruses[i].d, &viruses[i].s) != 3) {
            return 0;
        }
    }
    
    sort(viruses, viruses + n);
    
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
                    if (k <= n) {
                        dp[i] = max(dp[i], strength + dp[k]);
                    }
                    break;
                } else {
                    long long next_time = viruses[j].t + b;
                    int k = j + 1;
                    while (k < n && viruses[k].t < next_time) k++;
                    if (k <= n) {
                        dp[i] = max(dp[i], strength + dp[k]);
                    }
                }
            } else {
                long long next_time = viruses[j].t + a;
                int k = j + 1;
                while (k < n && viruses[k].t < next_time) k++;
                if (k <= n) {
                    dp[i] = max(dp[i], strength + dp[k]);
                }
                break;
            }
        }
        
        if (energy > 0) {
            dp[i] = max(dp[i], strength);
        }
    }
    
    printf("%lld\n", dp[0]);
    
    return 0;
} 