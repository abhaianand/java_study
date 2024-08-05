package java_study.inheritance;

//1) single - only 1 parent and 1 child
//2) multi level - 1 parent class , extend to another child , and that child then extend to another child and again that child extend to another child
//3) hierarchy - 1 single parent - extend to every child , 1 parent can have different child
//4) multiple - different number of parent class extend to a single child
// what is inheritance - acquiring all type of properties(variables) and behaviour (methods) from one class to another class is called inheritance
class A{
    int a = 100;
    void method1(){
        System.out.println(a);
    }
}
 class B extends A{ //parent A child B - single level inheritance
     int b = 200;
    void method2(){
        System.out.println(b);
        System.out.println(a);
    }
 }
 class C extends B{  //mutli level inheritance A extends to B, B extends to C
    int c = 300;
    void method3(){
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
 }
public class Type_of_inheritance_main {  // for a single file there will be only 1 public class
    public static void main(String args[]){

     B objb = new B();
     C objc = new C();
    // objb.method1();
    // objb.method2();
        objc.method3();


    }
}
