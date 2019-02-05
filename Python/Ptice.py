# Ptice https://open.kattis.com/problems/ptice

a = ['A', 'B', 'C', 'A', 'B', 'C']
b = ['B', 'A', 'B', 'C']
g = ['C', 'C', 'A', 'A', 'B', 'B']
ad = 0
br = 0
go = 0

c = 0
c2 = 0

n = int(input())
data = list(input())
for i in range(n):
    if data[i] == a[c]:
        ad += 1
    if data[i] == b[c2]:
        br += 1
    if data[i] == g[c]:
        go += 1
    c += 1
    c2 += 1
    if c == 6:
        c = 0
    if c2 == 4:
        c2 = 0

m = max(ad, br, go)
print(m)

if ad == m:
    print("Adrian")
if br == m:
    print("Bruno")
if go == m:
    print("Goran")
