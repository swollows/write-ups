import sys
from collections import defaultdict

def dijkstra(graph, start, n):
    """단일 출발점에서 모든 점까지의 최단 거리를 구합니다."""
    dist = [float('inf')] * (n + 1)
    dist[start] = 0
    pq = [(0, start)]
    
    while pq:
        d, u = pq.pop(0)
        if d > dist[u]:
            continue
        
        for v, w in graph[u]:
            if dist[u] + w < dist[v]:
                dist[v] = dist[u] + w
                # 우선순위 큐 대신 단순 삽입 정렬로 구현
                inserted = False
                for i in range(len(pq)):
                    if dist[v] < pq[i][0]:
                        pq.insert(i, (dist[v], v))
                        inserted = True
                        break
                if not inserted:
                    pq.append((dist[v], v))
    
    return dist

def solve():
    t = int(input())
    
    for _ in range(t):
        n, x, y, k = map(int, input().split())
        
        # 그래프 구성
        graph = defaultdict(list)
        for _ in range(n - 1):
            a, b, d = map(int, input().split())
            graph[a].append((b, d))
            graph[b].append((a, d))
        
        # 각 서버에서 x, y까지의 최단 거리 계산
        dist_x = dijkstra(graph, x, n)
        dist_y = dijkstra(graph, y, n)
        
        # 각 서버에 대해 가능한 업그레이드 옵션들 계산
        upgrades = []
        
        for i in range(1, n + 1):
            dx = dist_x[i]
            dy = dist_y[i]
            
            min_dist = min(dx, dy)
            max_dist = max(dx, dy)
            
            # 업그레이드 1: 0 이익 → 1 이익 (비용: min_dist)
            if min_dist <= k:
                upgrades.append((1, min_dist, i, 1))  # (이익 증가, 비용, 서버, 단계)
            
            # 업그레이드 2: 1 이익 → 2 이익 (비용: max_dist - min_dist)
            if max_dist <= k and min_dist <= k:
                upgrades.append((1, max_dist - min_dist, i, 2))  # (이익 증가, 비용, 서버, 단계)
        
        # 효율성(이익/비용) 순으로 정렬
        def efficiency(upgrade):
            profit, cost, _, _ = upgrade
            if cost == 0:
                return float('inf')
            return profit / cost
        
        upgrades.sort(key=lambda x: (-efficiency(x), x[1]))
        
        # 각 서버의 현재 단계 추적
        server_level = [0] * (n + 1)  # 각 서버의 현재 단계 (0, 1, 2)
        total_profit = 0
        used_cost = 0
        
        for profit_increase, cost, server, level in upgrades:
            # 해당 서버가 이전 단계에 있어야 업그레이드 가능
            if server_level[server] == level - 1 and used_cost + cost <= k:
                total_profit += profit_increase
                used_cost += cost
                server_level[server] = level
        
        print(total_profit)

if __name__ == "__main__":
    solve() 