package Aggregate;

import java.util.ArrayList;
import java.util.List;

public class CountUpperLowerLetters {
    public static void main(String args[]){
        String test = "ABbcLyRP";
        char[] ch = test.toCharArray();
        List list = new ArrayList();
        int upper=0,lower=0;
        for (int i = 0; i < test.length(); i++) {
            if (Character.isUpperCase(test.charAt(i))){
                 upper++;
             }
            if (Character.isLowerCase(test.charAt(i))){
                lower++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println(upper+" "+lower);
    }

}
