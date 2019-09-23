s="shashi Kiran"
D="0123456789"
i=0


print(s[2:8:1]) #o/p= ashi K
print(s[-1:-6:-1])# o/p = empty string
print(s[-5:-8:-1])
print(s[5:8:-1])
#print(s[])

print(D[2:8:1]) #o/p= ashi K
print(D[-1:-6:-1])# o/p= arik i
print(D[-5:-9:-2])

"""NOTE:
Forward direction:
Default value for start is 0
default value for end is (length of string)
default step value is 1

Backward directin:
Default value for start is -1
default value for end is -(length of string + 1)
default step value is -1


"""