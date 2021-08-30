package Composition;

public class ArrayMaxMin {
    public static void main(String[] args){
    int[] arr = {1,4,6,2,3,4,8,9,0};
     int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.print(arr[0]);

    }
}
