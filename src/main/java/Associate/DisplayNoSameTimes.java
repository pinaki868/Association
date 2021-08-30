package Associate;

import java.util.LinkedList;
import java.util.List;

public class DisplayNoSameTimes {
    public  static void main(String args[]){
        List<Integer> m = new LinkedList<>();
        List<Integer> n = new LinkedList<>();

        m.add(2);
        m.add(3);
        m.add(4);

        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);

        for (int a:m) {
            for (int b:n) {
                if (a>=b){
                    System.out.print(a + " ");
                }
            }
        }


    }

}
