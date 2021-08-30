package Associate;

import java.util.*;

public class FineCalculate {
    public static void main(String args[]){
    int arr[] = {2,3,1,2,3,4,5,6};

        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int p = arr[i];

            if (map.containsKey(p)){
                map.put(p,map.get(p)+1);
            }
            else{
                map.put(p,1);
            }
        }
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" is key and value is "+entry.getValue());
        });

        }
}
