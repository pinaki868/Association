package Composition;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        String s= "pig parrot dog";
       // 1. reverse a String
       // 2. reverse the words in string
       // 3. arrange the string in ascending order
        String reverse="";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {

            reverse= reverse+ s.charAt(i);
        }
        System.out.println(reverse);

    }
}
