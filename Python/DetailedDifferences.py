# Detailed Differences https://open.kattis.com/problems/detaileddifferences

n = int(input())

for i in range(n):
    data = input()
    data2 = input()
    print(data)
    print(data2)
    s = ''
    for j in range(len(data)):
        if (data[j] == data2[j]):
            s += "."
        else:
            s += "*"
    print(s)
    print()
