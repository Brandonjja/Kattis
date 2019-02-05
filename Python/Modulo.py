# Modulo https://open.kattis.com/problems/modulo

list = []
for n in range(10):
    a = int(input()) % 42
    if a not in list:
            list.append(a)
print(len(list))
