package Pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedNum {
    public static void main(String args[]){
        int num[] = {8,3,3,4,5,2,2,2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: num) {
            if (map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else {
                map.put(n,1);
            }
        }

        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }

}
