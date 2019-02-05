# Last Factorial Digit https://open.kattis.com/problems/lastfactorialdigit

def fact(n):
    if n == 1:
        return 1
    else:
        return n * fact(n - 1)

a = int(input())
for i in range(a):
    print(str(fact(int(input())))[-1])
