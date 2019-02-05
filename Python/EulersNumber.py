# Euler's Number https://open.kattis.com/problems/eulersnumber

def fact(a):
    ans = 1
    f = 1
    for i in range(1, a+1):
        f *= i
        ans += 1 / f
    return ans

print(fact(int(input())))
