T = int(input())
for i in range(T):
    N = int(input())
    U = N%10
    T = int((N%100)/10)
    H = int((N%1000)/100)
    print("Yes") if (N == (H**3 + T**3 + U**3)) else print("No")