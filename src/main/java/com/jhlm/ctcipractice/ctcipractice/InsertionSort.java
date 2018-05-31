package com.jhlm.ctcipractice.ctcipractice;

public class InsertionSort extends Sort {
    private Integer[] data;

    public InsertionSort(Integer[] d) {
        sort(d);
        data = new Integer[d.length];
        for(int i = 0; i < d.length; i++) {
            data[i] = d[i];
        }
    }

    public void insert(int x) {
        Integer[] copy = new Integer[data.length];

        for(int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        
        data = new Integer[data.length + 1];
        
        for(int i = 0; i < data.length; i++) {
            data[i] = copy[i];
        }

        data[data.length - 1] = x;

        sort(data);
    }

    @Override
    public void sort(Integer[] dataStructure){
        if(dataStructure.length > 1) {
            for(int j = 0; j < dataStructure.length; j++){
                int key = dataStructure[j];
                int i = j - 1;
                while(i >= 0 && dataStructure[i] > key){
                    dataStructure[i + 1] = dataStructure[i];
                    i = i - 1;
                }
                dataStructure[i + 1] = key;
            }
        }

    }
}
