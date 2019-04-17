package com.binarytree;

public class Entry<T extends Comparable<?>> {
    int value;
    Entry<T> left;
    Entry<T> right;
}