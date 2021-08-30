package Associate;

public class ReverseNumber {

    public static void main(String args[]){
        int num = 23456;
        int reverse = 0,p;
        while(num>0){
            p = num % 10;
            reverse = reverse*10 + p;
            num = num/10;
        }
    }
}
