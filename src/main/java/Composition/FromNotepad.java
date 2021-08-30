package Composition;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FromNotepad {


    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Pinaki Kundu\\Desktop\\Name.txt";
        //File file = new File("C:\\Users\\Pinaki Kundu\\Desktop\\Name.txt");
        //FileInputStream fis = new FileInputStream(file);
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
        String line;
        int paragraphCount=1;
        int sentenceCount = 0;
        int countWords = 0;
        String sorted = null;
        List<String> list = new ArrayList<String>();


        while ((line = bfr.readLine())!=null)
            if (line.equals("")) {
                paragraphCount++;
        }
        else {

            String[] sentenceArray = line.split("[!?.:]+");
            sentenceCount += sentenceArray.length;

            String[] wordList = line.split("\\s");
            countWords +=  wordList.length;
                list.add(line);


        }
           System.out.println("paragraph Count is "+paragraphCount );
        System.out.println("sentence count is "+sentenceCount);
        System.out.println("words count is "+countWords);
       //   System.out.println(ist.size());l
        list.stream().sorted().forEach(System.out::println);


    }

    public double check(double p){
        return p;
    }
}
