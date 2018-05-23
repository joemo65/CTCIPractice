package com.jhlm.ctcipractice.ctcipractice;

import java.lang.reflect.Array;

public class MergeSort extends Sort {
    @Override
    public void sort(Integer[] dataStructure){
        mergeSort(dataStructure, new Integer[dataStructure.length], 0, dataStructure.length - 1);
    }

    private void mergeSort(Integer[] dataStructure, Integer[] temp, int leftStart, int rightEnd){
        if(leftStart >= rightEnd)
            return;
        
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(dataStructure, temp, leftStart, middle);
        mergeSort(dataStructure, temp, middle + 1, rightEnd);
        mergeHalves(dataStructure, temp, leftStart, rightEnd);
    }

    private void mergeHalves(Integer[] dataStructure, Integer[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;  

        while (left <= leftEnd && right <= rightEnd) {
            if(dataStructure[left] <= dataStructure[right]){
                temp[index] = dataStructure[left];
                left++;
            }
            else {
                temp[index] = dataStructure[right];
                right++;
            }
            index++;
        }

        System.arraycopy(dataStructure, left, temp, index, leftEnd - left + 1);
        System.arraycopy(dataStructure, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, dataStructure, leftStart, size);
    }
}
