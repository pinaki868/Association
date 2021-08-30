package Composition;

import java.io.*;
import java.util.*;

public class PassValue {

//    public static void change(int y){
//      System.out.println("value of y in Change is "+y);
//        int x= 10;
//        System.out.println("value of x in change in "+x);
//    }

    public static void main(String[] args) throws IOException {
        int x = 5;
        System.out.println("value of x in method is "+x);
//
//        PassValue.change(x);
//
//        System.out.println("value of x in main method is "+x);

        File file =  new File("C:\\Users\\Pinaki Kundu\\Desktop\\tcs_interview.txt");
//        Scanner scan  = new Scanner(file);
//        scan.useDelimiter("\\Z");
//        System.out.println(scan.next());

        BufferedReader bf =  new BufferedReader(new FileReader(file));
        String str;
        while((str=bf.readLine())!=null){
           // System.out.println(str);
         List<String> list= new ArrayList<String>();
         list.add(str);
            //Collections.sort(list);
            //System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.size());
            }

        }


    }
}
