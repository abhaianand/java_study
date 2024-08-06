package java_study.methodoverriding_final_and_super;

// final can be apply to class method and variables
//once you assign value cannot change the value - variables

class A{
   final int a =100;
}

public class Final_keywords_variables {

    public static void main(String args[]){
        A obj = new A();
       // obj.a = 200;
        System.out.println(obj.a);


    }
}
