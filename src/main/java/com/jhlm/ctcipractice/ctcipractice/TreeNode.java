package com.jhlm.ctcipractice.ctcipractice;

public class TreeNode<T> extends Node<T> {
    public TreeNode(T item) {
        super(item);
    }

    public TreeNode<T> left;
    public TreeNode<T> right;
}
