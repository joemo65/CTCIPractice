package com.jhlm.ctcipractice.ctcipractice;

public class Sort implements iSort {
    public Sort() {

    }
    @Override
    public void swap(Integer indexA, Integer indexB, Integer[] dataStructure) {
        int temp = dataStructure[indexA];
        dataStructure[indexA] = dataStructure[indexB];
        dataStructure[indexB] = temp;
    }   

    @Override
    public void sort(Integer[] dataStructure) {
        //do nothing
    }
}
