# Statistics https://open.kattis.com/problems/statistics

case = 1
while (1):
    try:
        data = list(map(int, input().split()))
        data.remove(data[0])
        ma = max(data)
        mi = min(data)
        r = ma - mi
        c = "Case " + str(case) + ":"
        print(c, mi, ma, r)
        case += 1
    except EOFError:
        break
