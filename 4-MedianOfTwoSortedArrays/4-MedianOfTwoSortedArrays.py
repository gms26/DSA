# Last updated: 5/25/2026, 11:13:51 AM
class Solution(object):
    def findMedianSortedArrays(self, n1, n2):
        a=n1+n2 
        a=sorted(a)
        m=len(a)/2
        if len(a)%2!=0:
            return a[m]
        else:
            c=a[m-1]+a[m]
            return float(c)/2
        return 0         