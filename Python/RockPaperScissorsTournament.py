# Rock-Paper-Scissors Tournament https://open.kattis.com/problems/rockpaperscissors

while (True):
    line = input()
    if (line == "0"):
        break;
    line = line.split(" ")
    n = int(line[0])
    k = int(line[1])
    win = []
    lose = []
    for i in range(n + 1):
        win.append(0)
        lose.append(0)
    games = int(k * n * (n - 1) / 2)
    for i in range(games):
        l = input().split(" ")
        if (l[1] == l[3]):
            continue
        f = l[1]
        s = l[3]
        p1 = int(l[0])
        p2 = int(l[2])
        if (f == "rock" and s == "paper"):
            lose[p1] += 1
            win[p2] += 1
        elif (f == "paper" and s == "rock"):
            lose[p2] += 1
            win[p1] += 1
        elif (f == "paper" and s == "scissors"):
            lose[p1] += 1
            win[p2] += 1
        elif (f == "scissors" and s == "paper"):
            lose[p2] += 1
            win[p1] += 1
        elif (f == "scissors" and s == "rock"):
            lose[p1] += 1
            win[p2] += 1
        else:
            lose[p2] += 1
            win[p1] += 1
    for i in range(1, n + 1):
        if (win[i] + lose[i] == 0):
            print("-")
            continue
        y = (win[i] / (win[i] + lose[i]))
        x = "%.3f" % y
        print(x)
    print("")
