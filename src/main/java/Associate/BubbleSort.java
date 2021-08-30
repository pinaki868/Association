package Associate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void main(String args[]){
       int[] arr = {3,1,2,9,5,6,0,11,10,99};
       int temp = 0;
       int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

        System.out.println("smallest "+arr[0]+" max value "+arr[len-1]);



    }

}
