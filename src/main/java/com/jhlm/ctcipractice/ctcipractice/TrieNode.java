package com.jhlm.ctcipractice.ctcipractice;

import java.util.HashMap;

public class TrieNode<T> extends Node<T> {
    public TrieNode(T item) {
        super(item);
    }

    public HashMap<T, TrieNode<T>> children;
    public Boolean isEndOfTree;
}
