# Last updated: 5/25/2026, 11:09:02 AM
class Solution(object):
    def reverseStr(self, s, k):
        result = []
        n = len(s)
        
        for i in range(0, n, 2 * k):
            part_to_reverse = s[i:i + k][::-1]
            
            part_to_keep = s[i + k:i + 2 * k]
            
            result.append(part_to_reverse + part_to_keep)
        
        return ''.join(result)
        