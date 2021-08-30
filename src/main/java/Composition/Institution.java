package Composition;

import java.util.List;

public class Institution {

    String name;
    private List<Department> departmentList;

    Institution(String name, List<Department> departments){
        this.name = name;
        this.departmentList=departments;
    }
}
