s="shashikiran"

def slice(s,start,end,step):
    retStr = ""
    if step>0 and end<start:
        return ""
    elif step>0 and (end-start)<step:
        return ""
    elif step<0 and ((len(s)-end)+start)<0:
        return ""

    if step>0:
        for i in range(start,end,step):
            retStr = retStr+s[i]
    else :
        for i in range(start,(end-len(s)),step):
            retStr = retStr + s[i]


    return retStr

#print(slice(s,10,11,2))
#print(slice(s,5,2,1))
#print(slice(s,1,5,4))
print(slice(s,-2,3,-2))
print(slice(s,2,3,-2))
