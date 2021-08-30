package Aggregate;

public class Static {
    int i;
    static int j;
    final String p="Pinaki";

    public Static(){
        System.out.println("I am in constructor");
    }

    static{
        j=10;
        System.out.println("in static block");
    }

    public static void main(String[] args){
        System.out.println("Static variable value is "+j);
        Static stat =  new Static();
        System.out.println("final result "+stat.p);
    }



}
