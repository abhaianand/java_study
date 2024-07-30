package java_study;

import javax.xml.namespace.QName;

public class Class_oops_employees {
    String name;
    int id;
    String position;
    int salary;


    void print_method() {
        System.out.println("name of employee = " +name);
        System.out.println("id of employee = "+id);
        System.out.println("position of the employee = "+position);
        System.out.println("salary of the employee = "+salary);
        System.out.println("  ");
    }

    public static void main(String[] args) {

        Class_oops_employees  emp = new Class_oops_employees(); //object creation
        emp.id = 200;
        emp.salary = 300;
        emp.name = "demo name";
        emp.position ="lead";
        emp.print_method();

        Class_oops_employees  emp2 = new Class_oops_employees(); //object creation
        emp2.id = 201;
        emp2.salary = 301;
        emp2.name = "demo name 2";
        emp2.position ="senior";
        emp2.print_method();


    }
}