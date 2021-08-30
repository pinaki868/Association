package Associate;
//program to replace an element of an array with sum of other elements
public class Test {

public static void main (String args[]){
    int arr[] = {2,1,3,1,3,4};
int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }

    for (int p :arr) {
        int q = sum-p;
        System.out.print(q + " ");
    }
}
}


