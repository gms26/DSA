# Last updated: 5/25/2026, 11:06:49 AM
class Solution(object):
    def distanceBetweenBusStops(self, d, s, d1):
        if s==d1:
            return 0
        if s>d1:
            s,d1=d1,s
        t=sum(d[s:d1])
        c=sum(d)
        a=c-t
        return min(t,a)

        
                
        