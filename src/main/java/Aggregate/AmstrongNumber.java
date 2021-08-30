package Aggregate;

public class AmstrongNumber {
    public static void main(String args[]){
        int n = 371;
        int q = 0,temp,p;
        temp = n;
        while(n>0){
        p = n%10;
        n = n/10;
        q = q+ (p*p*p);
        }
        if (q==temp){
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("Number is not");
        }
    }
}
