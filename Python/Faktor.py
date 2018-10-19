# https://open.kattis.com/problems/faktor

data = input().split()
A = int(data[0])
I = int(data[1])

C = A * I
C -= A

if C % A == 0:
    C += 1

print(C)