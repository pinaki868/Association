package Aggregate;

public class Main {

    public static void main(String[] args){
Bank bank = new Bank("Axis");
Employee employee = new Employee("Srishti");
String name1=bank.getBankName();
String name2= employee.getemployee();
System.out.println("Employee name "+name2+" Works in Bank "+name1);

    }

}
