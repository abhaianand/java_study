package java_study.methodoverriding_final_and_super;
// if you cannot override method in child class if you make parent as final class
// final cannot  extend the class into any other class if the final keyword is for class

final class A{

    void method1(){
        System.out.println("method1");
    }
}

class B extends A{
    void method1() {
        System.out.println("method2");

    }
}

public class Final_method {
    public  static void main(String args[]){

        B obj =  new B();
        obj.method1();

    }

}
