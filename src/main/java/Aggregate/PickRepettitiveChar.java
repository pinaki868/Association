package Aggregate;

import java.util.HashMap;
import java.util.Map;

public class PickRepettitiveChar {

    public static void main(String args[]){
        String s= "abcaabcabcdefabc";
        char s1[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: s1) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
//                map.put(c,1);
            }
        }
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

//            if (m.getValue()!==1){
//
//            }
        }


    }

}
