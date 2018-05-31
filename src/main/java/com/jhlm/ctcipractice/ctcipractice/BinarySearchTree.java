package com.jhlm.ctcipractice.ctcipractice;

public class BinarySearchTree {
    private TreeNode<Integer> head;

    public BinarySearchTree() {
        head = new TreeNode<Integer>(0);
    }

    public void insert(Integer newValue){
        TreeNode<Integer> current = head;
        TreeNode<Integer> previous = head;

        while(current != null){
            previous = current;
            if(newValue < current.data){
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        //this will only work in specific cases
        //TODO: make this reorder the tree.
        if(previous.data < newValue) {
            previous.left = new TreeNode<Integer>(newValue);
        }
        else {
            previous.right = new TreeNode<Integer>(newValue);
        }
    }

    public TreeNode<Integer> find(Integer value) {
        TreeNode<Integer> current = head;

        while(current != null) {
            if(value == current.data) {
                return current;
            }

            if(value < current.data) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }
        
        return null;
    }
}
