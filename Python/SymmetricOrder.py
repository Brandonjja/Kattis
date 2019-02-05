# Symmetric Order https://open.kattis.com/problems/symmetricorder

set = 1

while (1):
    n = int(input())
    if n == 0:
        break
    lst = []
    print("SET " + str(set))
    for i in range(int(n / 2)):
        print(input())
        lst.append(input())
    if n % 2 != 0:
        print(input())
    for i in range(len(lst) - 1, -1, -1):
        print(lst[i])
    set += 1
