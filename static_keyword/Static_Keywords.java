package java_study.static_keyword;
public class Static_Keywords {
    //non static variables
    int a = 100;
    // static variables
    static int b = 200;
    //non static variables
    void method1(){
        System.out.println("non static method");
    }
    //static method
    static void metthod2(){
        System.out.println(" static method");
    }
    // from the non static method you can access everything
    void nonstatic_method(){
        System.out.println(a); //non static variables
        System.out.println(b); // static variables
        method1();
        metthod2();
    }
    //public static void main (string[] args)
    //public - access modifier - available in whole project because
    // static - common for across all class and method
    //void - nothing return
    // main -  method name
    // (string[] args) -  string is the type and args is the single dimension array
}
