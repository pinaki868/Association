package Aggregate;

public class Bank {
    private String name;

    public Bank(String name){
        this.name=name;
    }

    public String getBankName(){

        return this.name;
    }

    public static void main(String[] args){

        try{
            int i = 2/0;
        }
        catch (ArithmeticException e){
            System.out.println("caught in catch");
        }
        finally {
            System.out.println("in final block");
        }

        System.out.println("in last block");

    }
}
