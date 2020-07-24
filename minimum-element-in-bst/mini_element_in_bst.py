#User function Template for python3

##Structure of the node

class Node:
    data=0
    left=None
    right=None


def minValue(root):
    if root is None:
        return -1
    elif (root.left is None and root.right is None):
        return root.data
    elif (root.left is None):
        return root.data
    else:
        return minValue(root.left)
