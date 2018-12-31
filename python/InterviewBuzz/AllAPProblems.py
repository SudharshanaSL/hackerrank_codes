#code
seriesCount = int(input())
for i in range(seriesCount):
    firstTerm, secondTerm = map(int, input().split())
    nthTerm = int(input())
    print((firstTerm + (nthTerm - 1)*(secondTerm - firstTerm)))