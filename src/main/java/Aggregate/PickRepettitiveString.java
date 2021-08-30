package Aggregate;

import java.util.HashMap;
import java.util.Map;

public class PickRepettitiveString {

    public static void main(String args[]){

        String s1= "Pinaki Cat boy bat lap lap Pinaki lap Pinaki";
        String s2[] =  s1.split(" ");

        Map<String,Integer> map = new HashMap<>();
        for (String s3: s2) {
          if (map.containsKey(s3)){
              map.put(s3,map.get(s3)+1);
          }
          else{
              map.put(s3,1);
          }
        }


        map.entrySet().forEach(entry -> {
            System.out.println("Key : " + entry.getKey() + " : " + entry.getValue());
        });


    }
}
