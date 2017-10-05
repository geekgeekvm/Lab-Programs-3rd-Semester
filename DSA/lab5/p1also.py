class TreeNode:
    def __init__(self,key,value):
        self.key=key
        self.value=value
        self.left=None
        self.right=None
        self.parent=None

class BinarySearchTree:
    def __init__(self,val):
        self.root=val
    
    def minimum(self):
        temp=self.root
        while temp.left is not None:
            temp=temp.left
        return temp
    
    def maximum(self):
        temp=self.root
        while temp.right is not None:
            temp=temp.right
        return temp
    
    def predecessor(self,keyptr):
        temp=keyptr
        if temp.left is not None:
            temp=temp.left
            while temp.right is not None:
                temp=temp.right 
            return temp
        while temp.parent is not None:
            if temp.parent.value<keyptr.value:
                return temp.parent
            temp=temp.parent
        return None
    
    def successor(self,keyptr):
        temp=keyptr
        if temp.right is not None:
            temp=temp.right
            while temp.left is not None:
                temp=temp.left
            return temp
        while temp.parent is not None:
            if temp.parent.value>keyptr.value:
                return temp.parent
            temp=temp.parent
        return None

    def search(self,k):
        temp=self.root
        while temp is not None:
            if temp.key==k:
                return True
            elif temp.key<k:
                temp=temp.right
            else:
                temp=temp.left
        return False
    
    def insert(self,key,value):
        newNode=TreeNode(key,value)
        if self.root is None:
            self.root=newNode
            return
        temp=self.root
        par=self.root
        while temp is not None:
            if temp.key>key:
                temp=temp.left
            else:
                temp=temp.right
            par=temp.parent
        if key>par.key:
            par.right=newNode
        else:
            par.left=newNode
        newNode.parent=par
        
    def delete(self,keyptr):
        if self.root is None:
            return
        #case 1: node to be deleted is a leaf
        if keyptr.left is None and keyptr.right is None:
            par=keyptr.parent
            if par.left is keyptr:
                par.left=None
            else:
                par.right=None

        #case 2: node has one child
        elif (keyptr.left is None and keyptr.right is not None):
            keyptr.key=keyptr.right.key
            keyptr.value=keyptr.right.value
            keyptr.right=None
        elif (keyptr.right is None and keyptr.left is not None):
            keyptr.key=keyptr.left.key
            keyptr.value=keyptr.left.value
            keyptr.left=None

        #case 3: node has 2 children
        else:
            s=successor(keyptr)
            keyptr.key=s.key
            keyptr.value=s.value
            return self.delete(s)

    def preOrderTraversal(self):
        temp=self.root
        print(temp.key,end=' ')
        if temp.left is not None:
            return self.preOrderTraversal(temp.left)
        else:
            return self.preOrderTraversal(temp.right)

def main():
    node=BinarySearchTree(25)
    node.insert(12)
    node.insert(15)
    s=node.search(30)
    node.insert(123)
    node.insert(45)
    print(s)
    print(node.minimum().val)
    print(node.maximum().val)
    print()
    print(node.predecessor(node.left)
    print()
    print(node.successor(node.left)
    print()     
    node.preOrderTree()
    node.delete(12)
    print()     
    node.preorderTree()
    print(node.search(12))

if __name__ == '__main__':
    main()