# Last updated: 5/25/2026, 11:05:00 AM
class Solution(object):
    def finalValueAfterOperations(self, o):
       x=0
       for i in o:
        if i=='++X' or i=='X++':
            x+=1
        else:
            x-=1 
       return x