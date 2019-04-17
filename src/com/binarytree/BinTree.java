package com.binarytree;

public class BinTree {

    Entry root;

    public void addElem(int value) {
        Entry treeNode = new Entry();
        treeNode.value = value;

        if (root == null) {
            root = treeNode;
        } else {
            addRecursion(root, treeNode);
        }
    }

    private void addRecursion(Entry root, Entry treeNode) {

        if (treeNode.value < root.value) {
            if (root.left == null) {
                root.left = treeNode;
            } else {
                root = root.left;
                addRecursion(root, treeNode);
            }
        } else if (treeNode.value > root.value) {
            if (root.right == null) {
                root.right = treeNode;
            } else {
                root = root.right;
                addRecursion(root, treeNode);
            }
        }

    }

    public void mergeTrees(BinTree tree1, BinTree tree2) {
        BinTree bt = new BinTree();
        bt.root = marge(tree1.root, tree2.root);
        if (root == null) {
            root = bt.root;
        }
    }

    private Entry marge(Entry root1, Entry root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        Entry copy = new Entry();

        if (root1 == null) {
            copy.value = root2.value;
            copy.left = marge(root1, root2.left);
            copy.right = marge(root1, root2.right);

        } else if (root2 == null) {
            copy.value = root1.value;
            copy.left = marge(root1.left, root2);
            copy.right = marge(root1.right, root2);

        } else {
            copy.value = root1.value + root2.value;
            copy.left = marge(root1.left, root2.left);
            copy.right = marge(root1.right, root2.right);
        }

        return copy;
    }

    public void print() {
        BTreePrinter.printNode(root);
    }

}
