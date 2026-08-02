class Solution(object):
    def containsDuplicate(self, nums):
        Set = set()
        for i in range(len(nums)):
            if nums[i] in Set:
                return True
            Set.add(nums[i])
        return False