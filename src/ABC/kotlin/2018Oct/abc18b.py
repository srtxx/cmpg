 = input()
 
def p(s, l, r):
    return s[:l] + s[l:r+1][::-1] + s[r+1:]
 
for _ in range(int(input())):
    l, r = map(int, input().split())
    S = p(S, l-1, r-1)
 
print(S)

## kotlinだとだるそうだったので
