# Yoda https://open.kattis.com/problems/yoda

n = input()
m = input()

a = ''
b = ''

while len(n) != len(m):
    if len(n) < len(m):
        n = "0" + n
    else:
        m = "0" + m

for i in range(len(n)):
    if n[i] < m[i]:
        b += m[i]
    elif m[i] < n[i]:
        a += n[i]
    else:
        a += n[i]
        b += m[i]


if a == '':
    print("YODA")
else:
    print(int(a))
if b == '':
    print("YODA")
else:
    print(int(b))
