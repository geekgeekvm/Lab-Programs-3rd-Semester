def isPrime(n):
	if n==1:
		return False
	count=0
	for i in range(2,n):
		if n%i!=0:
			count=count+1
		
	if count==n-2:
		return True
	else:
		return False

no=int(input("Enter a number."))
print(isPrime(no))

