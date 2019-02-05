# Exam https://open.kattis.com/problems/exam

n = int(input())
me = list(input())
fr = list(input())
same = 0
ctr = 0
for i, c in enumerate(me):
        if c == fr[i]:
                same += 1
        ctr += 1
print(ctr - abs(same - n))
