package java_study.inheritance;


class Parent{
   void method1(){
       System.out.println("parent");
   }
}
class Child1 extends Parent{
    void method2(){
        method1();
        System.out.println("child1");

    }
}
class Child2 extends Parent{

    void method3(){
        method1();
        System.out.println("child2");

    }
}
class Child3 extends Parent{
    void method4(){
        method1();
        System.out.println("child3");

    }
}
public class Hir_class{
public class Hierarchy_class {
    public static void main(String args[]){
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        Child3 obj3 = new Child3();
        obj1.method2();
        obj2.method3();
        obj3.method4();
    }
}
