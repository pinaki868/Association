package Associate;

import java.util.Arrays;

public class MissingNmbrArray {
    public static void main(String args[]){

        MissingNmbrArray miss = new MissingNmbrArray();
        int a[] = {1,4,5,2,3,6,8,9};
        int num = miss.array(a);
        System.out.println(num);

    }

    public int array(int arr[]){

        int p[]= arr;
        int num = 0;
        int n= p.length;
        int total2 = 0;
        int total = n*(n+1)/2;
        Arrays.sort(p);
        for (int i = 0; i < p.length; i++) {
                total2 = ++p[i];

        }
        num = total - total2;

         return num;
    }

}
