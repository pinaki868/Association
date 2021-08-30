package Composition;

import java.util.List;

public class Department extends FromNotepad{
String name;
private List<Student> students;

public Department(){
        System.out.println("In non P Child ");
    }

Department(String name, List<Student> students){

    this.name = name;
    this.students = students;
    System.out.println("In Paramterise Child ");
}

public List<Student> getStudents(){
    return students;
}

public String check(String q){
    return q;
}

}
