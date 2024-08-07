package java_study.interface_abstraction;


public class Multiple_inheritance implements Ab,Bc {
   public void method1(){

        System.out.println("interface1");
    }
    public void method2(){

        System.out.println("interface2");
    }
    public static void main(String args[]){

        Multiple_inheritance obj1 = new Multiple_inheritance();
        obj1.method1();
        obj1.method2();
    }
}
