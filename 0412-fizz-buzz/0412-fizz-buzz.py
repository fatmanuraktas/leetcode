class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        answer = []
        
        # Range is 1 to n inclusive
        for i in range(1, n + 1):
            # Check divisibility by both 3 and 5 (least common multiple is 15)
            if i % 3 == 0 and i % 5 == 0:
                answer.append("FizzBuzz")
            elif i % 3 == 0:
                answer.append("Fizz")
            elif i % 5 == 0:
                answer.append("Buzz")
            else:
                # Securely cast the integer to a string
                answer.append(str(i))
                
        return answer