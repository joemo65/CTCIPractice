package com.jhlm.ctcipractice.ctcipractice;

public class BubbleSort extends Sort {
    @Override
    public void sort(Integer[] dataStructure){
        for(int i = 0; i < dataStructure.length; i++){
            for(int j = i + 1; j < dataStructure.length; j++){
                if(dataStructure[j] < dataStructure[i]){
                    swap(i, j, dataStructure);
                }
            }
        }
    }
}
