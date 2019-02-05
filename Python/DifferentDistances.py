# Different Distances https://open.kattis.com/problems/differentdistances

while (1):
    data = list(map(float, input().split()))
    if data[0] == 0:
        break
    print(pow((pow(abs(data[0] - data[2]), data[4])) + (pow(abs(data[1] - data[3]), data[4])), (1.0/data[4])))
