# Ragged Right https://open.kattis.com/problems/raggedright

data = []
while (1):
    try:
        data.append(len(input()))
    except EOFError:
        break

m = max(data)
ans = 0
for i in range(len(data)):
    if data[i] == m:
        continue
    if i == len(data) - 1:
        break
    ans += pow(m - data[i], 2)
print(ans)
