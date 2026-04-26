class Solution:
    def evalRPN(self, tokens: List[str]) -> int:


        while len(tokens) > 1:

            for i in range(len(tokens)):

                if tokens[i] in "+-/*":

                    a = tokens[i-2]
                    b = tokens[i-1]
                    res = 0
                    if tokens[i] == '+':
                        res = int(a)+int(b)

                    elif tokens[i] == '-':
                        res = int(a) - int(b)

                        
                    elif tokens[i] == '*':
                        res = int(a) * int(b)

                    elif tokens[i] == '/':
                        res = int(int(a)/int(b))
                    
                    tokens = tokens[:i-2] + [str(res)] + tokens[i+1:]
                    break
        
        return int(tokens[0])
                

        