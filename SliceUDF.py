s="shashikiran"

def slice(s,start,end,step):
    retStr = ""
    for i in range(start,end,step):
        retStr = retStr+s[i]

    return retStr

print(slice(s,2,6,2))
