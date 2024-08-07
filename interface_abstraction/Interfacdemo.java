package java_study.interface_abstraction;

interface AAA{
    default void method1(){   // interface method should be default or static
        System.out.println("default");
    }
    static void method2(){ // interface method should be default or static
        System.out.println("static");
    }
}
public class Interfacdemo implements AAA{
    public static void main(String args[]){

        //scenario1
        /*  Interfacdemo obj =  new Interfacdemo();
        System.out.println("scenario1");
        obj.method1();
        AAA.method2(); */


        //scenario2
        System.out.println("scenario2");
        AAA ifv =  new Interfacdemo();
        ifv.method1();
        AAA.method2(); //static method can directly access from parent class

    }
}
