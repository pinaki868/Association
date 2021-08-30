package Aggregate;

import java.util.*;

public class PickRepettitiveChar2 {

    public static void main(String args[]) {
        String s = "fapabooafa";
        char[] c = s.toCharArray();
        int count = 0;
        List<Object> list = new ArrayList<>();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (Character c1 : c) {
            if (hashMap.containsKey(c1)) {
                hashMap.put(c1, hashMap.get(c1)+1);
            } else {
                hashMap.put(c1, 1);
            }
        }
        for (Map.Entry m: hashMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
            list.add(m.getKey());
        }
        System.out.println("space "+list.get(0));

    }
    }
