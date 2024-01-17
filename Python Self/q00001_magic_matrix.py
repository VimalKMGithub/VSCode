# Code written by "Vimal Kumar Mishra"
print()
print("Code written by \"Vimal Kumar Mishra\"")


# build odd magic square
def build_oms(s):
    if s % 2 == 0:
        s += 1
    q = [[0 for j in range(s)] for i in range(s)]
    p = 1
    i = s // 2
    j = 0
    while p <= (s * s):
        q[i][j] = p
        ti = i + 1
        if ti >= s:
            ti = 0
        tj = j - 1
        if tj < 0:
            tj = s - 1
        if q[ti][tj] != 0:
            ti = i
            tj = j + 1
        i = ti
        j = tj
        p = p + 1
    return q, s


# build singly even magic square
def build_sems(s):
    if s % 2 == 1:
        s += 1
    while s % 4 == 0:
        s += 2

    q = [[0 for j in range(s)] for i in range(s)]
    z = s // 2
    b = z * z
    c = 2 * b
    d = 3 * b
    o = build_oms(z)
    for j in range(0, z):
        for i in range(0, z):
            a = o[0][i][j]
            q[i][j] = a
            q[i + z][j + z] = a + b
            q[i + z][j] = a + c
            q[i][j + z] = a + d
    lc = z // 2
    rc = lc
    for j in range(0, z):
        for i in range(0, s):
            if i < lc or i > s - rc or (i == lc and j == lc):
                if not (i == 0 and j == lc):
                    t = q[i][j]
                    q[i][j] = q[i][j + z]
                    q[i][j + z] = t
    return q, s


# to display odd magic square & singly even magic square
def display(q):
    s = q[1]
    for j in range(0, s):
        for i in range(0, s):
            print('%3d ' % (q[0][i][j]), end=" ")
        print()
    print()
    print("Magic sum :", (s * ((s * s) + 1) // 2))
    print()


# Python program to print magic square of double order
def build_dems(n):
    arr = [[(n*y)+x+1 for x in range(n)]for y in range(n)]
    for i in range(0, n//4):
        for j in range(0, n//4):
            arr[i][j] = (n*n + 1) - arr[i][j]
    for i in range(0, n//4):
        for j in range(3 * (n//4), n):
            arr[i][j] = (n*n + 1) - arr[i][j]
    for i in range(3 * (n//4), n):
        for j in range(0, n//4):
            arr[i][j] = (n*n + 1) - arr[i][j]
    for i in range(3 * (n//4), n):
        for j in range(3 * (n//4), n):
            arr[i][j] = (n*n + 1) - arr[i][j]
    for i in range(n//4, 3 * (n//4)):
        for j in range(n//4, 3 * (n//4)):
            arr[i][j] = (n*n + 1) - arr[i][j]
    for i in range(n):
        for j in range(n):
            print('%3d ' % (arr[i][j]), end=" ")
        print()
    print()
    print("Magic sum :", (n * ((n * n) + 1) // 2))
    print()


print()
order = int(input("Enter order of matrix (order > 2 & order < 100) : "))
print()
if order <= 2 or order >= 100:
    print("***Invalid Input***")
    print()
else:
    if order % 2 == 1:
        display(build_oms(order))
    elif order % 4 == 0:
        build_dems(order)
    else:
        display(build_sems(order))
