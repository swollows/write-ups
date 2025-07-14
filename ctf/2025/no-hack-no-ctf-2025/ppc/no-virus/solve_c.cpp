#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXN 5005
#define ll long long

typedef struct {
    ll time;
    ll damage;
    ll strength;
} Virus;

Virus viruses[MAXN];
ll dp[MAXN];
int n, h, a, b;

int compare_virus(const void* a, const void* b) {
    Virus* va = (Virus*)a;
    Virus* vb = (Virus*)b;
    if (va->time < vb->time) return -1;
    if (va->time > vb->time) return 1;
    return 0;
}

ll max(ll a, ll b) {
    return a > b ? a : b;
}

int main() {
    scanf("%d %d %d %d", &n, &h, &a, &b);
    
    if (n == 0) {
        printf("0\n");
        return 0;
    }
    
    for (int i = 0; i < n; i++) {
        scanf("%lld %lld %lld", &viruses[i].time, &viruses[i].damage, &viruses[i].strength);
    }
    
    qsort(viruses, n, sizeof(Virus), compare_virus);
    
    memset(dp, 0, sizeof(dp));
    
    for (int i = n - 1; i >= 0; i--) {
        dp[i] = dp[i + 1];
        
        ll energy = h;
        ll strength = 0;
        
        for (int j = i; j < n; j++) {
            if (energy >= viruses[j].damage) {
                energy -= viruses[j].damage;
                strength += viruses[j].strength;
                
                if (energy == 0) {
                    ll next_time = viruses[j].time + a;
                    int next_idx = j + 1;
                    while (next_idx < n && viruses[next_idx].time < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                    break;
                } else {
                    ll next_time = viruses[j].time + b;
                    int next_idx = j + 1;
                    while (next_idx < n && viruses[next_idx].time < next_time) {
                        next_idx++;
                    }
                    dp[i] = max(dp[i], strength + dp[next_idx]);
                }
            } else {
                ll next_time = viruses[j].time + a;
                int next_idx = j + 1;
                while (next_idx < n && viruses[next_idx].time < next_time) {
                    next_idx++;
                }
                dp[i] = max(dp[i], strength + dp[next_idx]);
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