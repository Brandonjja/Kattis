# Alphabet Spam https://open.kattis.com/problems/alphabetspam

data = list(map(ord, input()))
w = 0
l = 0
u = 0
s = 0

length = len(data)
for i in data:
    if i == 95:
        w += 1
    elif i >= 65 and i <= 90:
        u += 1
    elif i >= 97 and i <= 122:
        l += 1
    else:
        s += 1

print(w / length)
print(l / length)
print(u / length)
print(s / length)
