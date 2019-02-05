# Luhn's Checksum Algorithm https://open.kattis.com/problems/luhnchecksum

n = int(input())
c = 0
while c < n:
    data = list(input())[::-1]
    sum = 0
    i = 0
    while i < len(data):
        sum += int(data[i])
        try:
            i += 1
            a = int(data[i]) * 2
            if a > 9:
                a = list(str(a))
                a = int(a[0]) + int(a[1])
            sum += a
        except:
            break
        i += 1
    if sum % 10 == 0:
        print("PASS")
    else:
        print("FAIL")
    c += 1
