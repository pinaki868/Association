package Composition;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PickDuplicateNumbers {
    public static void main(String[] args) {

        int[] my_array = {1, 2, 5, 5};
        char[] char2 = {'a','b','a','c','a','b'};
        int count = 0;

        for (int i = 0; i < char2.length-1; i++)
        {
            for (int j = i+1; j < char2.length; j++)
            {
                if ((char2[i] == char2[j]) && (i != j))
                {


                }
            }
        }
    }


}
