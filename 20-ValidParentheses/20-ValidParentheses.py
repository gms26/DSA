# Last updated: 5/25/2026, 11:13:43 AM
class Solution(object):
    def isValid(self, s):
        if len(s) % 2 != 0:
            return False
        stack = []
        dic = {"(": ")", "[": "]", "{": "}"}
        for b in s:
            if b in dic:
                stack.append(b)
            else:
                if not stack or b != dic[stack.pop()]:
                    return False

        return not stack

