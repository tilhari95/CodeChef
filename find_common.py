class finding_common():
    def common(self,a,b):
        self.x=a
        self.y=b
        for n in self.x:
            c=0
            for s in self.y:
                if(n==s):
                    r=self.y.index(s)
                    self.y=self.y[0:r-1]+self.y[r+1:len(self.y)]
                    print r
                    print "comman character %s"%n
                    break;

a="AMITABH BACHCHAN"
b="RAJNIKANTH"
ob=finding_common()
ob.common(a,b)
