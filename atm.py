t=raw_input()
a,b=t.split()
c=b
a=int(a)
b=float(b)
if((a>=5 and a%5==0) and a<=b-0.5):
    print str(b-(a+0.5))+'0'
else:
    print c
