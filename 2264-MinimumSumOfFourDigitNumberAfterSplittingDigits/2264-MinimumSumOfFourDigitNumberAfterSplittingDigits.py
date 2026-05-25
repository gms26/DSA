# Last updated: 5/25/2026, 11:04:48 AM
class Solution(object):
    def minimumSum(self, num):
        digits = [int(d) for d in str(num)]
        
        digits.sort()
        
        new1 = digits[0] * 10 + digits[2]  
        new2 = digits[1] * 10 + digits[3] 
        
        return new1 + new2        