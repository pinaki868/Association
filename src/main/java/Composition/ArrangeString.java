package Composition;

import java.util.Arrays;

public class ArrangeString {
    public static void main(String[] args){
        String s= "pig parrot dog";

        String[] s1 = s.split(" ");
        Arrays.sort(s1);
        StringBuilder sb = new StringBuilder();
//        for (String w: s1) {
//            sb.append(w);
//            sb.append(" ");
//        }
//        String s2 = sb.toString().trim();


        //System.out.println(s2);

        }

}
