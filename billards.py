n=input()
a,b,ra,rb,p,q=0,0,1,1,0,0

for i in range(0,n):
    s=raw_input()
    s=s.split()
    p+=int(s[0])
    q+=int(s[1])
    if((p-q)>0):
        t=p-q
        if a<t:
            a=t                  
    else:
        t=q-p
        if b<t:
            b=t

if a>b:
    print 1,a
else:
    print 2,b
    
