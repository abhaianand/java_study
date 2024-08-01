package java_study.methods_constructor.constructor;

public class Student {
    // in constructor the name of constructor should be be same as class name , in method we can use any name we want
    // constructor will never return any values - so dont even have void
    //if you want to assign value to the variables constructor will is best
    // if you want to do task method is fine
    int a1;
    String b1;
    int c1;
    Student(int student_id, String student_name,int student_class){
        // DONT WRITE ANY PROGRAM LOGIC , JUST FOR assign variables
        //Constructors are used to initialize the object’s
        a1=student_id;
        b1=student_name;
        c1=student_class;
    }
    void Abc(){
        System.out.println(a1+" "+b1+" "+c1); //cascading
    }

}
// constructor 2 type a) default constructor b) parameterized constructor