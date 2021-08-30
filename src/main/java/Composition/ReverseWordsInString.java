package Composition;

public class ReverseWordsInString {
    public static void main(String[] args){
        String s= "pig parrot dog";
String[] s1= s.split(" ");
String reverse2 = "";
       // for (int i = 0; i < s1.length; i++) {
            for (int i = s1.length-1; i >= 0; i--) {

                String reverse="";
            String s2= s1[i];
            for (int j = s2.length()-1; j >=0 ; j--) {
            reverse = reverse+ s2.charAt(j);
            }
            reverse2 = reverse2+ reverse+ " ";
        }
System.out.println(reverse2);
    }
}
