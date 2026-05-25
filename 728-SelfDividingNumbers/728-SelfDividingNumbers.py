# Last updated: 5/25/2026, 11:08:33 AM
class Solution(object):
    def selfDividingNumbers(self, left, right):
        result = []
        
        for num in range(left, right + 1):
            if self.isSelfDividing(num):
                result.append(num)  #
        
        return result
    
    def isSelfDividing(self, num):
        original_num = num
        
        while num > 0:
            digit = num % 10  #
            if digit == 0 or original_num % digit != 0:  
                return False  
            num //= 10  
        
        return True