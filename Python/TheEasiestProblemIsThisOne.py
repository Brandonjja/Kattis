# The Easiest Problem is This One https://open.kattis.com/problems/easiest

def sumDigits(a):
    b = 0
    while a:
        b += a % 10
        a = int(a / 10)
    return b

while (1):
    n = int(input())
    if n == 0:
        break
    a = sumDigits(n)
    for i in range(11, 100000):
        if sumDigits(i * n) == a:
            print(i)
            break
