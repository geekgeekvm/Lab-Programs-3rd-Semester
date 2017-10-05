class Stack:
	def __init__(self,size):
		self.size=size
		self.top=-1
		self.s=[]

	def isEmpty(self,s):
		return True if self.top==-1 else False

	def push(self,value):
		self.top+=1
		self.s.append(value)
	def pop(self):
		if self.isEmpty(self.s):
			return "$"
		ret=self.s.pop()
		self.top-=1
		return ret

def postfixEvaluation(exp,s):
	for i in exp:
		if i.isdigit():
			s.push(i)
		else:
			a=s.pop()
			b=s.pop()
			s.push(str(eval(a+i+b)))
	return int(s.pop())

def main():
	s=Stack(10)
	exp="231*+9-"
	print(postfixEvaluation(exp,s))




if __name__=='__main__':
	main()



