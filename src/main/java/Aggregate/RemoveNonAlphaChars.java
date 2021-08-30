package Aggregate;

import java.util.Scanner;

public class RemoveNonAlphaChars {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String are[] = s.split("\\W+");
        for (String str: are) {
            System.out.println(str);
        }

    }


}
