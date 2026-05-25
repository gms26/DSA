# Last updated: 5/25/2026, 11:11:46 AM
class Solution(object):
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        word_set = set(wordDict)  # Faster lookup
        n = len(s)
        dp = [False] * (n + 1)
        dp[0] = True  # Empty string is always "segmentable"

        for i in range(1, n + 1):
            for j in range(i):
                if dp[j] and s[j:i] in word_set:
                    dp[i] = True
                    break

        return dp[n]
        