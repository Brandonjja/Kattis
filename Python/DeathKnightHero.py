# Death Knight Hero https://open.kattis.com/problems/deathknight

n = int(input())
count = 0
for _ in range(n):
    data = list(input())
    for i in range(len(data)):
        try:
            if data[i] == "C" and data[i + 1] == "D":
                flag = 1
                break
            flag = 0
        except IndexError:
            flag = 0
    if flag == 0:
        count += 1
print(count)
