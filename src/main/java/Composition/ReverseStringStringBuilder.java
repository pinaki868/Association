package Composition;

import java.util.Scanner;

public class ReverseStringStringBuilder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String s= "pig parrap gip";
        StringBuilder sb = new StringBuilder();

        sb.append(s);
        sb= sb.reverse();
        System.out.println("1 "+sb);
        String reverse= sb.toString();

        if (s.equals(reverse)){
            System.out.println("1s a palindrome");


        }

    }
}
