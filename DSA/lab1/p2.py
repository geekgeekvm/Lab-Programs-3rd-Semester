#program 2
"""print first n fib numbers"""

def fib1(n):
	a,b=0,1
	for i in range(n):
		print(a,end=' ')
		a,b=b,a+b
fib1(int(input("Enter number to of terms")))


def fib2(n):
	if n<=1:
		return n
	else:
		return (fib2(n-1)+fib2(n-2))


no=int(input("Enter number of terms."))
for i in range(no):
	print(fib2(i),end=' ')
