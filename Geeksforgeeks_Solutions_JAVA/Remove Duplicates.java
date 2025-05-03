#User function Template for python3
class Solution:
    def removeDups(self, S):
        # code here
        st=set()
        s1=""
        for i in s:
            if i not in st:
                s1+=i
                st.add(i)
        return s1