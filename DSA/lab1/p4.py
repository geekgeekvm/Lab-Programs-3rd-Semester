#bubble sort
def bubSort(n,l):
	for j in range(n):
		for i in range(n-1):
			if l[i]>l[i+1]:
				temp=l[i]
				l[i]=l[i+1]
				l[i+1]=temp
n=int(input("Enter size"))
l=[]
for i in range(n):
	l.append(int(input("Enter element")))
bubSort(n,l)
for i in range(n):
	print(l[i])

#selection sort
def selSort(n,l):
	for i in range(n-1):
		for j in range(i,n):
			small=l[i]
			sml=i
			if l[j]<small:
				temp=l[j]
				l[j]=l[sml]
				l[sml]=temp;
l=[]
for i in range(n):
	l.append(int(input("Enter element")))
selSort(n,l)
for i in range(n):
	print(l[i])		
