package com.binarytree;

//2*. Объединить 2 бинарных дерева

public class Main {

    public static void main(String[] args) {

        BinTree binTree = new BinTree();
        binTree.addElem(4);
        binTree.addElem(2);
        binTree.addElem(3);
        binTree.addElem(5);
        binTree.addElem(-2);
        binTree.addElem(7);

        System.out.println("Tree #1 : ");
        binTree.print();

        BinTree binTree2 = new BinTree();
        binTree2.addElem(2);
        binTree2.addElem(1);
        binTree2.addElem(-10);
        binTree2.addElem(22);
        binTree2.addElem(7);
        binTree2.addElem(40);
        binTree2.addElem(3);

        System.out.println("Tree #2 : ");
        binTree2.print();

        BinTree binTreeSum = new BinTree();
        binTreeSum.mergeTrees(binTree2, binTree);

        System.out.println("Marge tree: ");
        binTreeSum.print();
    }
}
