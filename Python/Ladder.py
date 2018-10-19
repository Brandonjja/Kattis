data = input().split()
h = int(data[0])
v = int(data[1])

import math

ans = (h / math.sin(math.radians(v)))
ans = int(ans) + 1
print(ans)