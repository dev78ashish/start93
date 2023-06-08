for _ in range(int(input())):
    n = int(input())
    l = list(map(int, input().split()))
    c = 0
    for i in l:
        if i % 2 == 0:
            c += 1
    if c == n:
        print((2 ** c - 1) % (10**9 + 7))
    else:
        print((2 ** c) % (10**9 + 7))
