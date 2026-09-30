# Last updated: 9/30/2026, 9:54:18 AM
class Solution(object):
    def minimumSum(self, num):
        digits = [int(d) for d in str(num)]
        
        digits.sort()
        
        new1 = digits[0] * 10 + digits[2]  
        new2 = digits[1] * 10 + digits[3] 
        
        return new1 + new2        