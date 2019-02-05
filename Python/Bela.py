# https://open.kattis.com/problems/bela

def check(hand, dom):
    h = hand[0]
    d = hand[1]
    if h == 'A':
        return 11
    elif h == 'K':
        return 4
    elif h == 'Q':
        return 3
    elif h == 'J':
        if d == dom:
            return 20
        return 2
    elif h == 'T':
        return 10
    elif h == '9':
        if d == dom:
            return 14
        return 0
    elif h == '8' or h == '7':
        return 0

a = input().split()
n = 4 * int(a[0])
dom = a[1]

sum = 0

for i in range(n):
    h = list(input())
    sum += check(h, dom)
print(sum)
