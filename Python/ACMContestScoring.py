# ACM Contest Scoring https://open.kattis.com/problems/acm

dic = {}
right = 0
time = 0
while (1):
    data = input().split()
    if data[0] == "-1":
        break
    if data[1] in dic:
        dic[data[1]] += 1
    else:
        dic[data[1]] = 0
    if data[2] == "right":
        right += 1
        time += int(dic[data[1]]) * 20 + int(data[0])
print(right, time)
