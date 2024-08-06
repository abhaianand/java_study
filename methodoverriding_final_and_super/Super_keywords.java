package java_study.methodoverriding_final_and_super;

//overloading - if you extend parent to child 1 , and change the value and print  it will print the child value , and also if you print without change the value it will print parent va;ue
// so if you extend child 1 to child 2 and print the value without changing the value it will print the value of variable in child 1 but instead of that i want to print the value of parent - we use super keyword
// super- immediate parent class


class A {
    String x = "parent";
}
class B extends A{
    void method1() {
        String x = "child";

        System.out.println(super.x); // super- immediate parent class
    }
}
public class Super_keywords {
    public static void main(String args[]){

        B obj = new B();
        obj.method1();

    }
}
