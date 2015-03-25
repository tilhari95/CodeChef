class boyer(object):
    def __init__(self,t,p):
        self.t=t
        self.p=p
        self.a={}
    def prefixfunction(self):
        for i in range (0,len(self.p)):
            self.a[self.p[i]]=max(1,len(self.p)-1-i)
            self.a['*']=len(self.p)
        print self.a
    def matcher(self):
        m=len(self.p)-1
        n=len(self.t)-1
        self.prefixfunction()
        self.pos=0
        for i in range(0,n-m):
            if(self.t[m+i]!=self.p[m]):
                s=self.t[m+i]
                if s in self.a:
                    i=i+self.a[s]
                else:
                    i=i+m+1
            else:
               a=0
               while(a<=m):
                   if(self.t[a+i]==self.p[a]):
                       a+=1
                   else:
                       break
               if(a==m):
                   print "found"
               else:
                   print "not found"
            
t=raw_input()
p=raw_input()
ob=boyer(t,p)
ob.matcher()
