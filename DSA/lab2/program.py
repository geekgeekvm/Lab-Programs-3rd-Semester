class Node:
    def __init__(self,value):
        self.value=value
        self.next=None
class LinkedList:
    def __init__(self):
        dummy=Node(0)
        self.head=dummy
        self.tail=dummy
    
    def printList(self):
        temp=self.head.next
        if temp is None:
            print("Empty")
        else:
            while temp is not None:
                print(temp.value,end=' ')
                temp=temp.next
        print(" ")
    
    def search(self,val):
        temp=self.head.next
        while temp is not None:
            if temp.value==val:
                return temp
        return None
    
    def len(self):
        temp=self.head.next
        len=0
        while temp is not None:
            len+=1
            temp=temp.next
        return len
    
    def isEmpty(self):
        if self.head.next is None:
            return True
        return False
    
    #inserting w pointer
    def insert(self,val,ptr):
        newNode=Node(val)
        if ptr is None:
            print("No such pointer")
            return
        if self.head.next is None:
            self.head.next=newNode
            return
        if ptr.next is None:
            ptr.next=newNode
            self.tail=newNode
            return
        temp=ptr.next
        ptr.next=newNode
        newNode.next=temp
        
    def insertAtIndex(self,val,index):
        newNode=Node(val)
        posCounter=0
        current,prev=self.head.next,None
        if current is None:
            self.head.next=newNode
            return
        if index==0:
            newNode.next=self.head.next
            self.head.next=newNode
            return
        while current is not None:
            if posCounter==index:
                prev.next=newNode
                newNode.next=current
                return
            posCounter+=1
            prev=current
            current=current.next
        if posCounter==index:
            prev.next=newNode
            return
        print("Index not found!")
    def delete(self,ptr):
        if ptr.next is None:
            print("Last element!")
        else:
            ptr.next=ptr.next.next
    
def main():
    L = LinkedList()
    L.insert(10,L.head)
    print('List is: ',end=' ')
    L.printList()
    L.insert(12,L.head.next)
    print('List is: ',end=' ')
    L.printList()
    L.insert(2,L.head)
    print('List is: ',end=' ')
    L.printList()
    print('Size of L is ',L.len())
    L.delete(L.head)
    print('List is: ',end=' ')
    L.printList()
    L.delete(L.head.next)
    print('List is: ',end=' ')
    L.printList()
    print('List is empty?',L.isEmpty())
    print('Size of L is ',L.len())
    L.delete(L.head)
    print('List is empty?',L.isEmpty())
    print('Size of L is ',L.len())
    L.insertAtIndex(2,0)
    L.insertAtIndex(1,0)
    L.insertAtIndex(4,2)
    L.insertAtIndex(3,2)
    print('List is: ',end=' ')
    L.printList()

if __name__ == '__main__':
    main()