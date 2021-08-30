package Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Pinaki", 1, "ECE");
        Student s2 = new Student("Parwez", 2, "ECE");
        Student s3 = new Student("Kunal", 3, "ECE");
        Student s4 = new Student("Kunal", 1, "CSC");
        Student s5 = new Student("Kunal", 2, "CSC");
        Student s6 = new Student("Kunal", 1, "Mech");


        List<Student> csc = new ArrayList<Student>();
        csc.add(s4);
        csc.add(s5);
        List<Student> ece = new ArrayList<Student>();
        ece.add(s1);
        ece.add(s2);
        ece.add(s3);
        List<Student> mech = new ArrayList<Student>();
        csc.add(s6);

        Department CSC_dep = new Department("CSC",csc);
        Department ECE_dep = new Department("ECE",ece);
        Department Mech_dep = new Department("Mech", mech);

        List<Department> departments = new ArrayList<Department>();
        departments.add(CSC_dep);
        departments.add(ECE_dep);
        departments.add(Mech_dep);


    }
}
