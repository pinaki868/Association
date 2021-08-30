package Aggregate;

public class SentenceToLower {
    public static void main(String args[]) {
        String test = "this is java";
        String ab[] = test.split(" ");
        String add = "",plus="";
        for (int i = 0; i < ab.length; i++) {
            String p = ab[i].substring(0,1).toUpperCase() + ab[i].substring(1);
            add= add + " " + p;

        }
        plus = plus + add;

        System.out.println("the sentence is :"+plus);

    }
}
