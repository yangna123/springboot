package com.hspedu.collection.list_;

public class findCommon {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={4,5,6,7,8,9};
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }

            }

        }
    }
}
