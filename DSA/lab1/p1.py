def fact1(n):
	fact=n
	for i in range (1,n):
		fact=fact*i
	return fact

def fact2(n):
	if n==1:
		return n
	else:
		return n*fact2(n-1)
	

f=int(input("Enter a positive integer to find its factorial"))
if f<0:
	print("Please enter positive number only!!")
else:
	print(fact1(f))
	print(fact2(f))

