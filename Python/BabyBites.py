# Baby Bites https://open.kattis.com/problems/babybites

n = int(input())
data = input().split()
flag = 0
for i in range(n):
    if data[i] == str(i+1) or data[i] == "mumble":
        continue
    else:
        flag = 1
        break
if flag == 0:
    print("makes sense")
else:
    print("something is fishy")
