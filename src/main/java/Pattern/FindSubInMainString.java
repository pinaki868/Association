package Pattern;

public class FindSubInMainString {

    public static void main(String args[]){
        String s1= "qabcdeabcghyabcpabc";
        String s2= "abc";
        int counter = 0;
        int n = s2.length();
        for (int i = 0; i < s1.length()-n+1; i++) {
            if (s1.substring(i,i+n).equalsIgnoreCase(s2)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
