class Solution:
    stack = []
    queue = []
    
    def __init(self):
        self.stack = []
        self.queue = []
    
    def pushCharacter(self, ch):
        self.stack.append(ch)
        
    def enqueueCharacter(self, ch):
        self.queue.append(ch)
        
    def popCharacter(self):
        return self.stack.pop()
        
    def dequeueCharacter(self):
        return self.queue.pop(0)
        
